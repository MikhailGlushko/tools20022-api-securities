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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Execution of a redemption order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RedemptionExecution" src="doc-files/RedemptionExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmRedeemedNetAmount
 * RedemptionExecution.mmRedeemedNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmPartialRedemptionWithholdingAmount
 * RedemptionExecution.mmPartialRedemptionWithholdingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmSettlementDate
 * RedemptionExecution.mmSettlementDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmIndividualExecutionDetails
 * RedemptionBulkExecution5.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmIndividualExecutionDetails
 * RedemptionMultipleExecution5.mmIndividualExecutionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
 * SwitchExecutionRedemptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5
 * RedemptionBulkExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
 * RedemptionMultipleExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution16
 * RedemptionExecution16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution15
 * RedemptionExecution15}</li>
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
 * "RedemptionExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * </ul>
 */
public class RedemptionExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount redeemedNetAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNetAmount
	 * RedemptionExecution16.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNetAmount
	 * RedemptionExecution15.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmNetAmount
	 * SwitchRedemptionLegExecution4.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedeemedNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of money paid to the investor as a result of the redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RedemptionExecution, CurrencyAndAmount> mmRedeemedNetAmount = new MMBusinessAttribute<RedemptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution16.mmNetAmount, RedemptionExecution15.mmNetAmount, SwitchRedemptionLegExecution4.mmNetAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedeemedNetAmount";
			definition = "Net amount of money paid to the investor as a result of the redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(RedemptionExecution obj) {
			return obj.getRedeemedNetAmount();
		}

		@Override
		public void setValue(RedemptionExecution obj, CurrencyAndAmount value) {
			obj.setRedeemedNetAmount(value);
		}
	};
	protected CurrencyAndAmount partialRedemptionWithholdingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution16.mmPartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution15.mmPartialRedemptionWithholdingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithholdingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount retained by the Fund and paid out later at a time decided by the Fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RedemptionExecution, CurrencyAndAmount> mmPartialRedemptionWithholdingAmount = new MMBusinessAttribute<RedemptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution16.mmPartialRedemptionWithholdingAmount, RedemptionExecution15.mmPartialRedemptionWithholdingAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialRedemptionWithholdingAmount";
			definition = "Amount retained by the Fund and paid out later at a time decided by the Fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(RedemptionExecution obj) {
			return obj.getPartialRedemptionWithholdingAmount();
		}

		@Override
		public void setValue(RedemptionExecution obj, CurrencyAndAmount value) {
			obj.setPartialRedemptionWithholdingAmount(value);
		}
	};
	protected ISODate settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money for the redemption is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RedemptionExecution, ISODate> mmSettlementDate = new MMBusinessAttribute<RedemptionExecution, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money for the redemption is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RedemptionExecution obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(RedemptionExecution obj, ISODate value) {
			obj.setSettlementDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionExecution";
				definition = "Execution of a redemption order.";
				derivationElement_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmIndividualExecutionDetails, RedemptionMultipleExecution5.mmIndividualExecutionDetails);
				subType_lazy = () -> Arrays.asList(SwitchExecutionRedemptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionExecution.mmRedeemedNetAmount, com.tools20022.repository.entity.RedemptionExecution.mmPartialRedemptionWithholdingAmount,
						com.tools20022.repository.entity.RedemptionExecution.mmSettlementDate);
				derivationComponent_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmObject(), RedemptionMultipleExecution5.mmObject(), RedemptionExecution16.mmObject(), RedemptionExecution15.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getRedeemedNetAmount() {
		return redeemedNetAmount;
	}

	public RedemptionExecution setRedeemedNetAmount(CurrencyAndAmount redeemedNetAmount) {
		this.redeemedNetAmount = Objects.requireNonNull(redeemedNetAmount);
		return this;
	}

	public CurrencyAndAmount getPartialRedemptionWithholdingAmount() {
		return partialRedemptionWithholdingAmount;
	}

	public RedemptionExecution setPartialRedemptionWithholdingAmount(CurrencyAndAmount partialRedemptionWithholdingAmount) {
		this.partialRedemptionWithholdingAmount = Objects.requireNonNull(partialRedemptionWithholdingAmount);
		return this;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public RedemptionExecution setSettlementDate(ISODate settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}
}