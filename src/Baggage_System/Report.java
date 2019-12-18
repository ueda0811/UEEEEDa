package Baggage_System;

import Ueda.EV3.VRTime;

public class Report {

	private Place 荷物の所在地;

	private VRTime 配達時間;

	private RequestInfo 荷物情報;

	private State 荷物状態;

	/**
	 * パラメタを渡し、報告オブジェクトを作成する
	 * 
	 * 報告を作成する（正）
	 * 日時に限界値を渡す
	 * 日時に"NICHIJI"を渡す
	 * 所在地に"BASYO"を渡す
	 * 荷物に報告型のインスタンスを渡す
	 * 
	 * 
	 * テスト番号:2-1-1
	 * テスト種別:A
	 * テストデータ:"NICHIJI"
	 * テスト手順:日時に"NICHIJI"データを渡す
	 * 期待されるテスト結果:日時に"NICHIJIが格納される。
	 * テスト結果の確認方法:結果を目視で確認する
	 * 
	 * テスト番号:2-1-2
	 * テスト種別:A
	 * テストデータ:"BASYO"
	 * テスト手順:所在地に"BASYO"データを渡す
	 * 期待されるテスト結果:所在地に"SYOZAICHIが格納される。
	 * テスト結果の確認方法:結果を目視で確認する
	 * 
	 * テスト番号:2-1-3
	 * テスト種別:A
	 * テストデータ:""
	 * テスト手順:荷物に"NIMOTSU"データを渡す
	 * 期待されるテスト結果:荷物に"NOMOTSUが格納される。
	 * テスト結果の確認方法:結果を目視で確認する
	 * 
	 * 
	 */
	public Report makereport(VRTime 日時, Place 所在地, bag 荷物) {
		return null;
	}

}
