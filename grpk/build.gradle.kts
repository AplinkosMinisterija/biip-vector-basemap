plugins {
    application
}

repositories {
    maven {
        url = uri("https://repo.osgeo.org/repository/release/")
    }

    maven {
        url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }

    mavenCentral()
}

dependencies {
    implementation(libs.planetiler)
    implementation("org.geotools:gt-geojson:31.0")
    implementation("org.geotools:gt-epsg-wkt:31.0")
    implementation("org.geotools:gt-epsg-hsql:31.0")
}

application {
    mainClass = "lt.biip.basemap.Basemap"
}
