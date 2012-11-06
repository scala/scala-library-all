# Scala Uber Library POM

This project contains, very simply, a pom file that is used to pull in other scala projects associated with the distribution.

## Building

To build/test, `cd` in to the project directory and run:

    > mvn install
    > cd test
    > sbt
    sbt> show dependency-classpath


You should see all the correct dependencies listed here.


## Deploying

TODO - Figure this out after 2.10.0 is ready for an uber package.

## Contributing

If you wish to contribute, you can find all of the necessary information on
the official Scala website: www.scala-lang.org.

Specifically, you can subscribe to the Scala mailing lists, read all of the
available documentation, and browse the live github repository.  You can contact
the Scala team by sending us a message on one of the mailing lists, or by using
the available contact form.

In detail:

- Scala website (links to everything else):
  http://www.scala-lang.org

- Scala documentation:
  http://docs.scala-lang.org

- Scala mailing lists:
  http://www.scala-lang.org/node/199

- Scala bug and issue tracker:
  https://issues.scala-lang.org

- Scala live git source tree:
  http://github.com/scala/scala

- Contact form:
  http://www.scala-lang.org/node/188


## License

SCALA LICENSE

Copyright (c) 2002-2012 EPFL, Lausanne, unless otherwise specified.
All rights reserved.

This software was developed by the Programming Methods Laboratory of the
Swiss Federal Institute of Technology (EPFL), Lausanne, Switzerland.

Permission to use, copy, modify, and distribute this software in source
or binary form for any purpose with or without fee is hereby granted,
provided that the following conditions are met:

   1. Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.

   2. Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.

   3. Neither the name of the EPFL nor the names of its contributors
      may be used to endorse or promote products derived from this
      software without specific prior written permission.


THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
SUCH DAMAGE.
