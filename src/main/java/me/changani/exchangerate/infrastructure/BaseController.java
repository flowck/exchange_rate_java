package me.changani.exchangerate.infrastructure;

public abstract class BaseController {
  private ContentType contentType;

  public ContentType getContentType() {
    return this.contentType;
  }
}
