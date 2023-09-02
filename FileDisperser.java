import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class FileDisperser {

    public static void main(String[] args) {
        String downloadsDir = "~/Downloads/"; // Replace with the actual path to the Downloads directory

        try {
            Files.walkFileTree(Paths.get(downloadsDir), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    String fileType = getFileType(file);
                    Path targetDir = getTargetDirectory(fileType);

                    Files.createDirectories(targetDir);
                    Files.move(file, targetDir.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);

                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("Files dispersed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getFileType(Path file) {
        String fileName = file.getFileName().toString();
        int dotIndex = fileName.lastIndexOf(".");

        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }

        return "unknown";
    }

    private static Path getTargetDirectory(String fileType) {
        String targetDir = "~/Downloads/"; // Replace with the actual path to the target directory

        Map<String, String> fileTypeMappings = new HashMap<>();
        // docs
        fileTypeMappings.put("pdf", "~/Documents/"); // Replace with the actual path to the PDF target directory
        fileTypeMappings.put("doc", "~/Documents/"); // Replace with the actual path to the Documents target
        fileTypeMappings.put("txt", "~/Documents/");
        fileTypeMappings.put("md", "~/Documents/");
        fileTypeMappings.put("xlsx", "~/Documents/");
        fileTypeMappings.put("xls", "~/Documents/");
        fileTypeMappings.put("ppt", "~/Documents/");
        fileTypeMappings.put("pptx", "~/Documents/");
        // images
        fileTypeMappings.put("svg", "~/Pictures/");
        fileTypeMappings.put("jpg", "~/Pictures/");
        fileTypeMappings.put("png", "~/Pictures/");
        fileTypeMappings.put("gif", "~/Pictures/");
        fileTypeMappings.put("webp", "~/Pictures/");
        fileTypeMappings.put("tiff", "~/Pictures/");
        fileTypeMappings.put("psd", "~/Pictures/");
        fileTypeMappings.put("raw", "~/Pictures/");
        fileTypeMappings.put("jpg", "~/Picures/"); // Replace with the actual path to the Images target directory
        // audio
        fileTypeMappings.put("mp3", "~/Music/"); // Replace with the actual path to the Music target directory

        return Paths.get(fileTypeMappings.getOrDefault(fileType, "/path/to/other")); // Replace with the actual path to
                                                                                     // the Other target directory
    }
}
