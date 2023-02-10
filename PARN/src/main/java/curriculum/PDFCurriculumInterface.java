package curriculum;

import Storage.Entity.Curriculum;

import java.io.IOException;

public interface PDFCurriculumInterface {
    String downloadCurriculum(Curriculum curriculum) throws IOException;
}
