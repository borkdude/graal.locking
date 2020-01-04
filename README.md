# graal.locking

A `locking` macro that works with GraalVM, as a library.

Mistakes are mine.

Credits should go to
[@taylorwood](https://github.com/taylorwood/clojurl/tree/locking-fix) for coming
up with the fix.

## Usage

``` clojure
(require '[borkdude.graal.locking :as locking])
(locking/locking (Object.) 1) ;;=> 1
```
