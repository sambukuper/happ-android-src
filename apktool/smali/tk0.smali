.class public final Ltk0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ltk0;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Ltk0;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Ltk0;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lb71;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Ltk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ltk0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lb71;

    .line 24
    .line 25
    check-cast p2, Lq51;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Ltk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ltk0;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    check-cast p2, Lq51;

    .line 45
    .line 46
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p2, p1}, Ltk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ltk0;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_2
    check-cast p1, Lb71;

    .line 62
    .line 63
    check-cast p2, Lq51;

    .line 64
    .line 65
    invoke-virtual {p0, p2, p1}, Ltk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ltk0;

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lc71;->X:Lc71;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, Lb71;

    .line 78
    .line 79
    check-cast p2, Lq51;

    .line 80
    .line 81
    invoke-virtual {p0, p2, p1}, Ltk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Ltk0;

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_4
    check-cast p1, Lb71;

    .line 93
    .line 94
    check-cast p2, Lq51;

    .line 95
    .line 96
    invoke-virtual {p0, p2, p1}, Ltk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Ltk0;

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_5
    check-cast p1, Lz85;

    .line 108
    .line 109
    iget-wide v2, p1, Lz85;->a:J

    .line 110
    .line 111
    check-cast p2, Lq51;

    .line 112
    .line 113
    new-instance p1, Ltk0;

    .line 114
    .line 115
    iget-object p0, p0, Ltk0;->i0:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, Lr68;

    .line 118
    .line 119
    const/4 v0, 0x1

    .line 120
    invoke-direct {p1, p0, p2, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_6
    check-cast p1, Lb71;

    .line 129
    .line 130
    check-cast p2, Lq51;

    .line 131
    .line 132
    invoke-virtual {p0, p2, p1}, Ltk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Ltk0;

    .line 137
    .line 138
    invoke-virtual {p0, v1}, Ltk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Ltk0;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Ltk0;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Ltk0;

    .line 9
    .line 10
    check-cast p0, Lcz7;

    .line 11
    .line 12
    const/4 v0, 0x7

    .line 13
    invoke-direct {p2, p0, p1, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Ltk0;

    .line 18
    .line 19
    check-cast p0, Lan7;

    .line 20
    .line 21
    const/4 v0, 0x6

    .line 22
    invoke-direct {p2, p0, p1, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    :pswitch_1
    new-instance p2, Ltk0;

    .line 27
    .line 28
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    invoke-direct {p2, p0, p1, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :pswitch_2
    new-instance p2, Ltk0;

    .line 36
    .line 37
    check-cast p0, Lkj4;

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    invoke-direct {p2, p0, p1, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :pswitch_3
    new-instance p2, Ltk0;

    .line 45
    .line 46
    check-cast p0, Lza3;

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    invoke-direct {p2, p0, p1, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :pswitch_4
    new-instance p2, Ltk0;

    .line 54
    .line 55
    check-cast p0, Lat2;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-direct {p2, p0, p1, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 59
    .line 60
    .line 61
    return-object p2

    .line 62
    :pswitch_5
    new-instance v0, Ltk0;

    .line 63
    .line 64
    check-cast p0, Lr68;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-direct {v0, p0, p1, v1}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 68
    .line 69
    .line 70
    check-cast p2, Lz85;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_6
    new-instance p2, Ltk0;

    .line 74
    .line 75
    check-cast p0, Ld6;

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-direct {p2, p0, p1, v0}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 79
    .line 80
    .line 81
    return-object p2

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Ltk0;->g0:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    sget-object v5, Lc71;->X:Lc71;

    .line 11
    .line 12
    iget-object v6, v0, Ltk0;->i0:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x2

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v6, Lcz7;

    .line 20
    .line 21
    iget-byte v1, v0, Ltk0;->h0:B

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    if-eq v1, v4, :cond_0

    .line 26
    .line 27
    if-ne v1, v8, :cond_1

    .line 28
    .line 29
    :cond_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v2, v7

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v6, Lcz7;->s0:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 42
    .line 43
    iput-byte v8, v0, Ltk0;->h0:B

    .line 44
    .line 45
    invoke-interface {v1, v6, v0}, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;->invoke(Lmq5;Lq51;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-ne v0, v5, :cond_3

    .line 50
    .line 51
    move-object v2, v5

    .line 52
    :cond_3
    :goto_0
    return-object v2

    .line 53
    :pswitch_0
    iget-byte v1, v0, Ltk0;->h0:B

    .line 54
    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    if-eq v1, v4, :cond_5

    .line 58
    .line 59
    if-ne v1, v8, :cond_4

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    move-object v2, v7

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iput-byte v4, v0, Ltk0;->h0:B

    .line 78
    .line 79
    const-wide/16 v3, 0x2710

    .line 80
    .line 81
    invoke-static {v3, v4, v0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-ne v1, v5, :cond_7

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_7
    :goto_1
    check-cast v6, Lan7;

    .line 89
    .line 90
    iput-byte v8, v0, Ltk0;->h0:B

    .line 91
    .line 92
    invoke-virtual {v6, v0}, Lan7;->c(Luy7;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-ne v0, v5, :cond_8

    .line 97
    .line 98
    :goto_2
    move-object v2, v5

    .line 99
    :cond_8
    :goto_3
    return-object v2

    .line 100
    :pswitch_1
    check-cast v6, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 101
    .line 102
    iget-byte v1, v0, Ltk0;->h0:B

    .line 103
    .line 104
    if-eqz v1, :cond_b

    .line 105
    .line 106
    if-eq v1, v4, :cond_a

    .line 107
    .line 108
    if-ne v1, v8, :cond_9

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_9
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object v2, v7

    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :cond_a
    :goto_4
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget v1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 125
    .line 126
    invoke-virtual {v6}, Lsu/happ/proxyutility/feature/main/MainActivity;->H()Lcom/tencent/mmkv/MMKV;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v3, "pref_mode"

    .line 131
    .line 132
    invoke-virtual {v1, v3}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v3, "VPN"

    .line 137
    .line 138
    if-nez v1, :cond_c

    .line 139
    .line 140
    move-object v1, v3

    .line 141
    :cond_c
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_e

    .line 146
    .line 147
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-nez v1, :cond_d

    .line 156
    .line 157
    iput-byte v4, v0, Ltk0;->h0:B

    .line 158
    .line 159
    invoke-virtual {v6, v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->Y(Ls51;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v5, :cond_f

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_d
    iget-object v0, v6, Lsu/happ/proxyutility/feature/main/MainActivity;->Y0:Lr6;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Lr6;->h0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_e
    iput-byte v8, v0, Ltk0;->h0:B

    .line 173
    .line 174
    invoke-virtual {v6, v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->Y(Ls51;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-ne v0, v5, :cond_f

    .line 179
    .line 180
    :goto_5
    move-object v2, v5

    .line 181
    goto :goto_7

    .line 182
    :cond_f
    :goto_6
    invoke-virtual {v6}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 187
    .line 188
    :cond_10
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    move-object v3, v0

    .line 193
    check-cast v3, Lxm4;

    .line 194
    .line 195
    const/16 v20, 0x0

    .line 196
    .line 197
    const v21, 0xfffd

    .line 198
    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    const-wide/16 v5, 0x0

    .line 202
    .line 203
    const/4 v7, 0x0

    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v9, 0x0

    .line 206
    const/4 v10, 0x0

    .line 207
    const/4 v11, 0x0

    .line 208
    const/4 v12, 0x0

    .line 209
    const/4 v13, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v15, 0x0

    .line 212
    const/16 v16, 0x0

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const/16 v18, 0x0

    .line 217
    .line 218
    const/16 v19, 0x0

    .line 219
    .line 220
    invoke-static/range {v3 .. v21}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v1, v0, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_10

    .line 229
    .line 230
    :goto_7
    return-object v2

    .line 231
    :pswitch_2
    move-object v1, v6

    .line 232
    check-cast v1, Lkj4;

    .line 233
    .line 234
    iget-byte v2, v0, Ltk0;->h0:B

    .line 235
    .line 236
    if-eqz v2, :cond_13

    .line 237
    .line 238
    if-eq v2, v4, :cond_12

    .line 239
    .line 240
    if-ne v2, v8, :cond_11

    .line 241
    .line 242
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_11
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    move-object v5, v7

    .line 250
    goto :goto_a

    .line 251
    :cond_12
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_13
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_14
    :goto_8
    iget-object v2, v1, Lkj4;->G0:Lx90;

    .line 259
    .line 260
    if-eqz v2, :cond_15

    .line 261
    .line 262
    iput-byte v4, v0, Ltk0;->h0:B

    .line 263
    .line 264
    invoke-virtual {v2, v0}, Lx90;->r(Lq51;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    if-ne v2, v5, :cond_15

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_15
    :goto_9
    iget-object v2, v1, Lkj4;->B0:Lvo5;

    .line 272
    .line 273
    if-eqz v2, :cond_14

    .line 274
    .line 275
    new-instance v2, Luh3;

    .line 276
    .line 277
    const/16 v3, 0x14

    .line 278
    .line 279
    invoke-direct {v2, v3}, Luh3;-><init>(B)V

    .line 280
    .line 281
    .line 282
    iput-byte v8, v0, Ltk0;->h0:B

    .line 283
    .line 284
    iget-object v3, v0, Ls51;->Y:Ls61;

    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {v3}, Lz68;->H(Ls61;)Lai;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    new-instance v6, Lds2;

    .line 294
    .line 295
    invoke-direct {v6, v2, v8}, Lds2;-><init>(Lgn2;B)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v6, v0}, Lai;->a(Lgn2;Lq51;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    if-ne v2, v5, :cond_16

    .line 303
    .line 304
    :goto_a
    return-object v5

    .line 305
    :cond_16
    :goto_b
    iget-object v2, v1, Lkj4;->B0:Lvo5;

    .line 306
    .line 307
    if-eqz v2, :cond_14

    .line 308
    .line 309
    check-cast v2, Lxo5;

    .line 310
    .line 311
    invoke-virtual {v2}, Lxo5;->d()V

    .line 312
    .line 313
    .line 314
    goto :goto_8

    .line 315
    :pswitch_3
    check-cast v6, Lza3;

    .line 316
    .line 317
    iget-byte v1, v0, Ltk0;->h0:B

    .line 318
    .line 319
    if-eqz v1, :cond_19

    .line 320
    .line 321
    if-eq v1, v4, :cond_18

    .line 322
    .line 323
    if-ne v1, v8, :cond_17

    .line 324
    .line 325
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto :goto_e

    .line 329
    :cond_17
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    move-object v2, v7

    .line 333
    goto :goto_e

    .line 334
    :cond_18
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    goto :goto_c

    .line 338
    :cond_19
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    iput-byte v4, v0, Ltk0;->h0:B

    .line 342
    .line 343
    sget-object v1, Lka3;->a:Lka3;

    .line 344
    .line 345
    invoke-virtual {v6, v1, v0}, Lza3;->g(Lna3;Luy7;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    if-ne v1, v5, :cond_1a

    .line 350
    .line 351
    goto :goto_d

    .line 352
    :cond_1a
    :goto_c
    iput-byte v8, v0, Ltk0;->h0:B

    .line 353
    .line 354
    sget-object v1, Lla3;->a:Lla3;

    .line 355
    .line 356
    invoke-virtual {v6, v1, v0}, Lza3;->g(Lna3;Luy7;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    if-ne v0, v5, :cond_1b

    .line 361
    .line 362
    :goto_d
    move-object v2, v5

    .line 363
    :cond_1b
    :goto_e
    return-object v2

    .line 364
    :pswitch_4
    check-cast v6, Lat2;

    .line 365
    .line 366
    iget-byte v1, v0, Ltk0;->h0:B

    .line 367
    .line 368
    if-eqz v1, :cond_1e

    .line 369
    .line 370
    if-eq v1, v4, :cond_1d

    .line 371
    .line 372
    if-ne v1, v8, :cond_1c

    .line 373
    .line 374
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    goto :goto_11

    .line 378
    :cond_1c
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    move-object v2, v7

    .line 382
    goto :goto_11

    .line 383
    :cond_1d
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    goto :goto_f

    .line 387
    :cond_1e
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    iget-object v1, v6, Lat2;->a:Lxm0;

    .line 391
    .line 392
    if-eqz v1, :cond_1f

    .line 393
    .line 394
    iput-byte v4, v0, Ltk0;->h0:B

    .line 395
    .line 396
    invoke-virtual {v1}, Lxm0;->f()Ldn8;

    .line 397
    .line 398
    .line 399
    if-ne v2, v5, :cond_1f

    .line 400
    .line 401
    goto :goto_10

    .line 402
    :cond_1f
    :goto_f
    iget-object v1, v6, Lat2;->b:Lxm0;

    .line 403
    .line 404
    if-eqz v1, :cond_20

    .line 405
    .line 406
    iput-byte v8, v0, Ltk0;->h0:B

    .line 407
    .line 408
    invoke-virtual {v1}, Lxm0;->f()Ldn8;

    .line 409
    .line 410
    .line 411
    if-ne v2, v5, :cond_20

    .line 412
    .line 413
    :goto_10
    move-object v2, v5

    .line 414
    :cond_20
    :goto_11
    return-object v2

    .line 415
    :pswitch_5
    check-cast v6, Lr68;

    .line 416
    .line 417
    iget-object v1, v6, Lr68;->a:Lkd8;

    .line 418
    .line 419
    iget-byte v9, v0, Ltk0;->h0:B

    .line 420
    .line 421
    if-eqz v9, :cond_23

    .line 422
    .line 423
    if-eq v9, v4, :cond_22

    .line 424
    .line 425
    if-ne v9, v8, :cond_21

    .line 426
    .line 427
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    goto :goto_17

    .line 431
    :cond_21
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    move-object v2, v7

    .line 435
    goto :goto_17

    .line 436
    :cond_22
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    goto :goto_12

    .line 440
    :cond_23
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    iput-byte v4, v0, Ltk0;->h0:B

    .line 444
    .line 445
    invoke-virtual {v6}, Lr68;->A()Ldn8;

    .line 446
    .line 447
    .line 448
    if-ne v2, v5, :cond_24

    .line 449
    .line 450
    goto :goto_16

    .line 451
    :cond_24
    :goto_12
    iget-object v3, v6, Lr68;->f:Lip5;

    .line 452
    .line 453
    if-eqz v3, :cond_28

    .line 454
    .line 455
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    iget-object v14, v4, Lh48;->Z:Ljava/lang/CharSequence;

    .line 460
    .line 461
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    iget-wide v10, v1, Lh48;->f0:J

    .line 466
    .line 467
    iput-byte v8, v0, Ltk0;->h0:B

    .line 468
    .line 469
    move-object v13, v3

    .line 470
    check-cast v13, Lop5;

    .line 471
    .line 472
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    if-nez v1, :cond_25

    .line 477
    .line 478
    goto :goto_13

    .line 479
    :cond_25
    invoke-static {v10, v11}, Lf88;->b(J)Z

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-eqz v1, :cond_26

    .line 484
    .line 485
    :goto_13
    move-object v0, v2

    .line 486
    goto :goto_14

    .line 487
    :cond_26
    new-instance v9, Llp5;

    .line 488
    .line 489
    const/4 v12, 0x0

    .line 490
    invoke-direct/range {v9 .. v14}, Llp5;-><init>(JLq51;Lop5;Ljava/lang/CharSequence;)V

    .line 491
    .line 492
    .line 493
    iget-object v1, v13, Lop5;->a:Ls61;

    .line 494
    .line 495
    new-instance v3, Lmp5;

    .line 496
    .line 497
    invoke-direct {v3, v13, v9, v7}, Lmp5;-><init>(Lop5;Lrn2;Lq51;)V

    .line 498
    .line 499
    .line 500
    invoke-static {v1, v3, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    :goto_14
    if-ne v0, v5, :cond_27

    .line 505
    .line 506
    goto :goto_15

    .line 507
    :cond_27
    move-object v0, v2

    .line 508
    :goto_15
    if-ne v0, v5, :cond_28

    .line 509
    .line 510
    :goto_16
    move-object v2, v5

    .line 511
    :cond_28
    :goto_17
    return-object v2

    .line 512
    :pswitch_6
    iget-byte v1, v0, Ltk0;->h0:B

    .line 513
    .line 514
    if-eqz v1, :cond_2b

    .line 515
    .line 516
    if-eq v1, v4, :cond_2a

    .line 517
    .line 518
    if-ne v1, v8, :cond_29

    .line 519
    .line 520
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    goto :goto_1a

    .line 524
    :cond_29
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    move-object v2, v7

    .line 528
    goto :goto_1a

    .line 529
    :cond_2a
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    goto :goto_18

    .line 533
    :cond_2b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    check-cast v6, Ld6;

    .line 537
    .line 538
    iget-object v1, v6, Ld6;->f0:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v1, Lux0;

    .line 541
    .line 542
    iput-byte v4, v0, Ltk0;->h0:B

    .line 543
    .line 544
    invoke-virtual {v1, v0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    if-ne v1, v5, :cond_2c

    .line 549
    .line 550
    goto :goto_19

    .line 551
    :cond_2c
    :goto_18
    iput-byte v8, v0, Ltk0;->h0:B

    .line 552
    .line 553
    const-wide/16 v3, 0x7d0

    .line 554
    .line 555
    invoke-static {v3, v4, v0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    if-ne v0, v5, :cond_2d

    .line 560
    .line 561
    :goto_19
    move-object v2, v5

    .line 562
    :cond_2d
    :goto_1a
    return-object v2

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
