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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SubBalanceType12Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Balance9;
import com.tools20022.repository.msg.QuantityBreakdown27;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Subbalances providing additional information on a specific position but that
 * is not to be accounted for in the building of the aggregate balance, for
 * example, registered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmSubBalanceType
 * AdditionalBalanceInformation15.mmSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmQuantity
 * AdditionalBalanceInformation15.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmSubBalanceAdditionalDetails
 * AdditionalBalanceInformation15.mmSubBalanceAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmQuantityBreakdown
 * AdditionalBalanceInformation15.mmQuantityBreakdown}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forAdditionalBalanceInformation15
 * ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEligibleForCollateralPurposesRule#forAdditionalBalanceInformation15
 * ConstraintEligibleForCollateralPurposesRule.forAdditionalBalanceInformation15
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBalanceInformation15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Subbalances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalBalanceInformation15", propOrder = {"subBalanceType", "quantity", "subBalanceAdditionalDetails", "quantityBreakdown"})
public class AdditionalBalanceInformation15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubBalTp", required = true)
	protected SubBalanceType12Choice subBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType12Choice
	 * SubBalanceType12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalBalanceInformation15, SubBalanceType12Choice> mmSubBalanceType = new MMMessageAttribute<AdditionalBalanceInformation15, SubBalanceType12Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "SubBalTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceType";
			definition = "Reason for the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubBalanceType12Choice.mmObject();
		}

		@Override
		public SubBalanceType12Choice getValue(AdditionalBalanceInformation15 obj) {
			return obj.getSubBalanceType();
		}

		@Override
		public void setValue(AdditionalBalanceInformation15 obj, SubBalanceType12Choice value) {
			obj.setSubBalanceType(value);
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected Balance9 quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Balance9
	 * Balance9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalBalanceInformation15, Balance9> mmQuantity = new MMMessageAttribute<AdditionalBalanceInformation15, Balance9>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of securities in the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Balance9.mmObject();
		}

		@Override
		public Balance9 getValue(AdditionalBalanceInformation15 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(AdditionalBalanceInformation15 obj, Balance9 value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "SubBalAddtlDtls")
	protected Max140Text subBalanceAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70C::SUBB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional sub-balance information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalBalanceInformation15, Optional<Max140Text>> mmSubBalanceAdditionalDetails = new MMMessageAttribute<AdditionalBalanceInformation15, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "SubBalAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70C::SUBB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetails";
			definition = "Provides additional sub-balance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(AdditionalBalanceInformation15 obj) {
			return obj.getSubBalanceAdditionalDetails();
		}

		@Override
		public void setValue(AdditionalBalanceInformation15 obj, Optional<Max140Text> value) {
			obj.setSubBalanceAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<QuantityBreakdown27> quantityBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown27
	 * QuantityBreakdown27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:BREAK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalBalanceInformation15, List<QuantityBreakdown27>> mmQuantityBreakdown = new MMMessageAssociationEnd<AdditionalBalanceInformation15, List<QuantityBreakdown27>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation15.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:BREAK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityBreakdown27.mmObject();
		}

		@Override
		public List<QuantityBreakdown27> getValue(AdditionalBalanceInformation15 obj) {
			return obj.getQuantityBreakdown();
		}

		@Override
		public void setValue(AdditionalBalanceInformation15 obj, List<QuantityBreakdown27> value) {
			obj.setQuantityBreakdown(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalBalanceInformation15.mmSubBalanceType, com.tools20022.repository.msg.AdditionalBalanceInformation15.mmQuantity,
						com.tools20022.repository.msg.AdditionalBalanceInformation15.mmSubBalanceAdditionalDetails, com.tools20022.repository.msg.AdditionalBalanceInformation15.mmQuantityBreakdown);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation15,
						com.tools20022.repository.constraints.ConstraintEligibleForCollateralPurposesRule.forAdditionalBalanceInformation15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBalanceInformation15";
				definition = "Subbalances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered.";
			}
		});
		return mmObject_lazy.get();
	}

	public SubBalanceType12Choice getSubBalanceType() {
		return subBalanceType;
	}

	public AdditionalBalanceInformation15 setSubBalanceType(SubBalanceType12Choice subBalanceType) {
		this.subBalanceType = Objects.requireNonNull(subBalanceType);
		return this;
	}

	public Balance9 getQuantity() {
		return quantity;
	}

	public AdditionalBalanceInformation15 setQuantity(Balance9 quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<Max140Text> getSubBalanceAdditionalDetails() {
		return subBalanceAdditionalDetails == null ? Optional.empty() : Optional.of(subBalanceAdditionalDetails);
	}

	public AdditionalBalanceInformation15 setSubBalanceAdditionalDetails(Max140Text subBalanceAdditionalDetails) {
		this.subBalanceAdditionalDetails = subBalanceAdditionalDetails;
		return this;
	}

	public List<QuantityBreakdown27> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public AdditionalBalanceInformation15 setQuantityBreakdown(List<QuantityBreakdown27> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}
}