package org.kie.builder;

import org.kie.io.Resource;

public interface KieFileSystem {

    KieFileSystem generateAndWritePomXML(GAV gav);
    
    KieFileSystem writePomXML(byte[] content);
    KieFileSystem writePomXML(String content);

    KieFileSystem writeProjectXML(byte[] content);
    KieFileSystem writeProjectXML(String content);
    
    KieFileSystem write(String path, byte[] content);
    KieFileSystem write(String path, String content);
    KieFileSystem write(String path, Resource resource);

    void delete(String... paths);

    byte[] read(String path);
}