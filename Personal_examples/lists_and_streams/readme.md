### Key Stream Rules to Remember
* **Streams do not store data**: They are pipelines that read directly from data structures like Lists or Sets.
* **Streams are lazy**: Intermediate operations (like `filter`, `map`) don't execute until you call a terminal operation (like `toList`, `reduce`, `forEach`).
* **Streams cannot be reused**: Once a terminal operation is called, the stream is closed and cannot be read again.