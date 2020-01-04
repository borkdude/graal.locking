# graal.locking

[![Clojars Project](https://img.shields.io/clojars/v/borkdude/graal.locking.svg)](https://clojars.org/borkdude/graal.locking)

A workaround for
[CLJ-1472](https://ask.clojure.org/index.php/740/locking-macro-fails-bytecode-verification-native-runtime)
as a library.

Credits should go to
[@taylorwood](https://github.com/taylorwood/clojurl/tree/locking-fix) for coming
up with the fix.

Mistakes are mine.

## Usage

``` clojure
(require '[borkdude.graal.locking :as locking])
(locking/locking (Object.) 1) ;;=> 1
```

## License

Copyright © 2019 Michiel Borkent

Distributed under the EPL License. See LICENSE.
