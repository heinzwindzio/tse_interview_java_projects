# 1. Reference to a Static Method

**Points directly to a static utility method belonging to a class.**

Lambda equivalent: (args) -> ClassName.staticMethodName(args)

Syntax: ClassName::staticMethodName



# 2. Reference to an Instance Method of a Particular Object

**Binds the method execution to a specific, already-instantiated object instance.**

Lambda equivalent: (args) -> objectReference.instanceMethodName(args)

Syntax: objectReference::instanceMethodName

