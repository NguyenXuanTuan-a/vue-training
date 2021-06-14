<?php

namespace App\Http\Controllers\Api;

use App\Models\User;
use Illuminate\Http\Request;
use App\Http\Controllers\Controller;

class UserController extends Controller
{
    public function create(Request $request) {
        User::create([
            'name' => $request->name,
            'avatar' => $request->avatar,
            'year' => $request->seniority,
            'is_work' => $request->isWorking,
            'level' => $request->level
        ]);
        return response()->json([
            'status' => true
        ], 200);
    }

    public function lists() {
        $list = User::all();
        return response()->json($list, 200);
    }

    public function item(Request $request) {
        $id = $request->id;
        $user = User::find($id);
        return response()->json($user, 200);
    }

    public function deleteItem(Request $request) {
        $id = $request->id;
        $user = User::find($id);
        $user->delete();
        return response()->json([], 200);
    }

    public function update(Request $request) {
        $id = $request->id;
        $name = $request->name;

        $user = User::find($id);
        $user->name = $name;
        $user->save();
        return response()->json([], 200);
    }

    public function search(Request $request) {
        dd($request->all());
    }

}
