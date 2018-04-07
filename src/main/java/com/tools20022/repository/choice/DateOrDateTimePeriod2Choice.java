/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriod2;
import com.tools20022.repository.msg.DateTimePeriodDetails2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a date or a date and time format for a period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod2Choice#mmDate
 * DateOrDateTimePeriod2Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod2Choice#mmDateTime
 * DateOrDateTimePeriod2Choice.mmDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateOrDateTimePeriod2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a date or a date and time format for a period."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
 * DateOrDateTimePeriodChoice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateOrDateTimePeriod2Choice", propOrder = {"date", "dateTime"})
public class DateOrDateTimePeriod2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected DatePeriod2 date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DatePeriod2
	 * DatePeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod2Choice
	 * DateOrDateTimePeriod2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period expressed with dates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice#mmDate
	 * DateOrDateTimePeriodChoice.mmDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DateOrDateTimePeriod2Choice, DatePeriod2> mmDate = new MMMessageAssociationEnd<DateOrDateTimePeriod2Choice, DatePeriod2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateOrDateTimePeriod2Choice.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Period expressed with dates.";
			previousVersion_lazy = () -> DateOrDateTimePeriodChoice.mmDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DatePeriod2.mmObject();
		}

		@Override
		public DatePeriod2 getValue(DateOrDateTimePeriod2Choice obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(DateOrDateTimePeriod2Choice obj, DatePeriod2 value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "DtTm", required = true)
	protected DateTimePeriodDetails2 dateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails2
	 * DateTimePeriodDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod2Choice
	 * DateOrDateTimePeriod2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period expressed with dates and times."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice#mmDateTime
	 * DateOrDateTimePeriodChoice.mmDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DateOrDateTimePeriod2Choice, DateTimePeriodDetails2> mmDateTime = new MMMessageAssociationEnd<DateOrDateTimePeriod2Choice, DateTimePeriodDetails2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateOrDateTimePeriod2Choice.mmObject();
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Period expressed with dates and times.";
			previousVersion_lazy = () -> DateOrDateTimePeriodChoice.mmDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails2.mmObject();
		}

		@Override
		public DateTimePeriodDetails2 getValue(DateOrDateTimePeriod2Choice obj) {
			return obj.getDateTime();
		}

		@Override
		public void setValue(DateOrDateTimePeriod2Choice obj, DateTimePeriodDetails2 value) {
			obj.setDateTime(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateOrDateTimePeriod2Choice.mmDate, com.tools20022.repository.choice.DateOrDateTimePeriod2Choice.mmDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateOrDateTimePeriod2Choice";
				definition = "Choice between a date or a date and time format for a period.";
				previousVersion_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DatePeriod2 getDate() {
		return date;
	}

	public DateOrDateTimePeriod2Choice setDate(DatePeriod2 date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public DateTimePeriodDetails2 getDateTime() {
		return dateTime;
	}

	public DateOrDateTimePeriod2Choice setDateTime(DateTimePeriodDetails2 dateTime) {
		this.dateTime = Objects.requireNonNull(dateTime);
		return this;
	}
}