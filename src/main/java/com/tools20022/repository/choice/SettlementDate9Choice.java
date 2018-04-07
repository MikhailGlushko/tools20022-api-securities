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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.SettlementDateCode7Choice;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the settlement date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice#mmDate
 * SettlementDate9Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice#mmDateCode
 * SettlementDate9Choice.mmDateCode}</li>
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
 * "SettlementDate9Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the settlement date."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementDate17Choice
 * SettlementDate17Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementDate9Choice", propOrder = {"date", "dateCode"})
public class SettlementDate9Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected DateAndDateTimeChoice date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice
	 * SettlementDate9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::SETT, ISO15022Synonym:
	 * :98C::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date in ISO format."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate17Choice#mmDate
	 * SettlementDate17Choice.mmDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDate9Choice, DateAndDateTimeChoice> mmDate = new MMMessageAttribute<SettlementDate9Choice, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementDate9Choice.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::SETT"), new ISO15022Synonym(this, ":98C::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date in ISO format.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDate17Choice.mmDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(SettlementDate9Choice obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(SettlementDate9Choice obj, DateAndDateTimeChoice value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "DtCd", required = true)
	protected SettlementDateCode7Choice dateCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDateCode7Choice
	 * SettlementDateCode7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice
	 * SettlementDate9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate17Choice#mmDateCode
	 * SettlementDate17Choice.mmDateCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDate9Choice, SettlementDateCode7Choice> mmDateCode = new MMMessageAttribute<SettlementDate9Choice, SettlementDateCode7Choice>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementDate9Choice.mmObject();
			isDerived = false;
			xmlTag = "DtCd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateCode";
			definition = "Date and time at which the securities are to be delivered or received.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDate17Choice.mmDateCode);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDateCode7Choice.mmObject();
		}

		@Override
		public SettlementDateCode7Choice getValue(SettlementDate9Choice obj) {
			return obj.getDateCode();
		}

		@Override
		public void setValue(SettlementDate9Choice obj, SettlementDateCode7Choice value) {
			obj.setDateCode(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementDate9Choice.mmDate, com.tools20022.repository.choice.SettlementDate9Choice.mmDateCode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDate9Choice";
				definition = "Choice of format for the settlement date.";
				nextVersions_lazy = () -> Arrays.asList(SettlementDate17Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTimeChoice getDate() {
		return date;
	}

	public SettlementDate9Choice setDate(DateAndDateTimeChoice date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public SettlementDateCode7Choice getDateCode() {
		return dateCode;
	}

	public SettlementDate9Choice setDateCode(SettlementDateCode7Choice dateCode) {
		this.dateCode = Objects.requireNonNull(dateCode);
		return this;
	}
}