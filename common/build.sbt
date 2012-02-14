/*
 *  ____    ____    _____    ____    ___     ____ 
 * |  _ \  |  _ \  | ____|  / ___|  / _/    / ___|        Precog (R)
 * | |_) | | |_) | |  _|   | |     | |  /| | |  _         Advanced Analytics Engine for NoSQL Data
 * |  __/  |  _ <  | |___  | |___  |/ _| | | |_| |        Copyright (C) 2010 - 2013 SlamData, Inc.
 * |_|     |_| \_\ |_____|  \____|   /__/   \____|        All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU Affero General Public License as published by the Free Software Foundation, either version 
 * 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See 
 * the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this 
 * program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
name := "common"

version := "1.2.1-SNAPSHOT"

organization := "com.precog"

scalaVersion := "2.9.1"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= Seq(
  "joda-time"                 % "joda-time"           % "1.6.2",
  "org.streum"                %% "configrity"         % "0.9.0",
  "com.reportgrid"            %% "blueeyes-json"      % "0.6.0-SNAPSHOT" changing(),
  "com.reportgrid"            %% "blueeyes-core"      % "0.6.0-SNAPSHOT" changing(),
  "com.reportgrid"            %% "blueeyes-mongo"     % "0.6.0-SNAPSHOT" changing(),
  "org.scala-tools.testing"   %% "scalacheck"         % "1.9",
  "org.specs2"                %% "specs2"             % "1.8"  % "test"
)
