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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.TransferInConfirmationV08;
import com.tools20022.repository.area.sese.TransferOutConfirmationV08;

/**
 * Either TransferDetails/EffectiveSettlementDate may be present in one or more
 * occurrences of TransferDetails or SettlementDetails/Effective Settlement Date
 * may be present, but not both.
 */
public class ConstraintEffectiveSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08
	 * TransferInConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV08> for_sese_TransferInConfirmationV08 = new MMConstraint<TransferInConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both.";
			owner_lazy = () -> TransferInConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV08 obj) throws Exception {
			check_sese_TransferInConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08
	 * TransferOutConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV08> for_sese_TransferOutConfirmationV08 = new MMConstraint<TransferOutConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			owner_lazy = () -> TransferOutConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV08 obj) throws Exception {
			check_sese_TransferOutConfirmationV08(obj);
		}
	};

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or SettlementDetails/Effective
	 * Settlement Date may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV08(TransferInConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV08(TransferOutConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}