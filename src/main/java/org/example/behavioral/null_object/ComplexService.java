package org.example.behavioral.null_object;

public class ComplexService {

  private final StorageService storage;

  private final String reportName;

  public ComplexService(StorageService storage) {
    this.storage = storage;
    reportName = "A Complex Report";
  }

  public ComplexService(String reportName, StorageService storage) {
    this.storage = storage;
    this.reportName = reportName;
  }

  public void generateReport() {
    System.out.println("Starting a complex report build!");

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Done with report..");
    storage.save(new Report(reportName));
  }
}
