/*
 * Developed by Vibert Bounyasit
 * Last modified 9/15/19 12:42 PM
 *
 * Copyright (c) 2019-present. All right reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vbounyasit

import com.vbounyasit.bigdata.ETL.TableMetadata
import com.vbounyasit.bigdata.exceptions.ErrorHandler
import com.vbounyasit.bigdata.transform.ExecutionPlan
import com.vbounyasit.bigdata.transform.pipeline.SourcePipeline
import pureconfig.error.ConfigReaderFailures

package object bigdata {

  type Sources = Map[String, SourcePipeline]
  type ExecutionPlans = Map[String, ExecutionPlan]
  type EitherRP = Either[ErrorHandler, SourcePipeline]
  type PureConfigLoaded[T] = Either[ConfigReaderFailures, T]
  type ExceptionWithMessage[T <: ErrorHandler] = String => T
  type OutputTables = Option[Seq[TableMetadata]]

  case class DatePattern(pattern: String)

  val datePattern: DatePattern = DatePattern("yyyy-MM-dd")

}
