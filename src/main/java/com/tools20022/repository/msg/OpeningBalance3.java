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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.OpeningBalance4Choice;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Opening balance for the statement period (first opening balance) or of this
 * page (intermediary opening balance).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmShortLongIndicator
 * OpeningBalance3.mmShortLongIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmOpeningBalance
 * OpeningBalance3.mmOpeningBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongDefaultRule#forOpeningBalance3
 * ConstraintShortLongDefaultRule.forOpeningBalance3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OpeningBalance3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OpeningBalance3", propOrder = {"shortLongIndicator", "openingBalance"})
public class OpeningBalance3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShrtLngInd", required = true)
	protected ShortLong1Code shortLongIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLong1Code
	 * ShortLong1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmShortLong
	 * SecuritiesBalance.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3
	 * OpeningBalance3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLngInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::4!c/[4!c[4c]]/4!c/[N]</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that the position is short or long."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OpeningBalance3, ShortLong1Code> mmShortLongIndicator = new MMMessageAttribute<OpeningBalance3, ShortLong1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmShortLong;
			componentContext_lazy = () -> com.tools20022.repository.msg.OpeningBalance3.mmObject();
			isDerived = false;
			xmlTag = "ShrtLngInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::4!c/[4!c[4c]]/4!c/[N]"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongIndicator";
			definition = "Indication that the position is short or long.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}

		@Override
		public ShortLong1Code getValue(OpeningBalance3 obj) {
			return obj.getShortLongIndicator();
		}

		@Override
		public void setValue(OpeningBalance3 obj, ShortLong1Code value) {
			obj.setShortLongIndicator(value);
		}
	};
	@XmlElement(name = "OpngBal", required = true)
	protected OpeningBalance4Choice openingBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance4Choice
	 * OpeningBalance4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3
	 * OpeningBalance3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::FIOP or INOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OpeningBalance3, OpeningBalance4Choice> mmOpeningBalance = new MMMessageAttribute<OpeningBalance3, OpeningBalance4Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OpeningBalance3.mmObject();
			isDerived = false;
			xmlTag = "OpngBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::FIOP or INOP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningBalance";
			definition = "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OpeningBalance4Choice.mmObject();
		}

		@Override
		public OpeningBalance4Choice getValue(OpeningBalance3 obj) {
			return obj.getOpeningBalance();
		}

		@Override
		public void setValue(OpeningBalance3 obj, OpeningBalance4Choice value) {
			obj.setOpeningBalance(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OpeningBalance3.mmShortLongIndicator, com.tools20022.repository.msg.OpeningBalance3.mmOpeningBalance);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintShortLongDefaultRule.forOpeningBalance3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OpeningBalance3";
				definition = "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance).";
			}
		});
		return mmObject_lazy.get();
	}

	public ShortLong1Code getShortLongIndicator() {
		return shortLongIndicator;
	}

	public OpeningBalance3 setShortLongIndicator(ShortLong1Code shortLongIndicator) {
		this.shortLongIndicator = Objects.requireNonNull(shortLongIndicator);
		return this;
	}

	public OpeningBalance4Choice getOpeningBalance() {
		return openingBalance;
	}

	public OpeningBalance3 setOpeningBalance(OpeningBalance4Choice openingBalance) {
		this.openingBalance = Objects.requireNonNull(openingBalance);
		return this;
	}
}