rm -rf output

mkdir -p output/mlib
mkdir -p output/classes

javac -d output/classes `find 1_creating_modules -name *.java`

jar -c -f output/mlib/util.jar -C output/classes .

rm -rf output/classes/*

# jar -f output/mlib/util.jar -d

javac -p output/mlib -d output/classes `find 2_using_modules -name *.java`

jar -c -f output/mlib/first.jar --main-class com.agiledeveloper.user.FirstUser -C output/classes .


rm -rf output/classes

java -p output/mlib -m com.agiledeveloper.first
# java -p output/mlib -m com.agiledeveloper.first/com.agiledeveloper.user.FirstUser

# javac -p output/mlib -d output/classes `find 3_implied_readability -name *.java`

# jar -c -f output/mlib/second.jar --main-class com.agiledeveloper.second.SecondUser -C output/classes .

# rm -rf output/classes

# java -p output/mlib -m second

# packaging

jpackage -n fibonacci -p output/mlib -m com.agiledeveloper.first/com.agiledeveloper.user.FirstUser


