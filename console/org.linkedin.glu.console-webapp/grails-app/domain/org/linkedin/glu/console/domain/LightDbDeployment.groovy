/*
 * Copyright (c) 2011 Yan Pujante
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.linkedin.glu.console.domain

/**
 * Implementation note: the purpose of this class is to allow fetching the columns minus the details
 * column. See the stack overflow question:
 * http://stackoverflow.com/questions/6914569/how-to-exclude-some-columns-with-gorm-with-dynamic-finders
 * @author ypujante@linkedin.com */
class LightDbDeployment
{
  static constraints = {
    startDate(nullable: false)
    endDate(nullable: true)
    username(nullable: true)
    fabric(nullable: false)
    description(nullable: true)
    status(nullable: true)
  }

  static mapping = {
    table 'db_deployment'
  }

  Date startDate = new Date()
  Date endDate
  String username
  String fabric
  String description
  String status
}
