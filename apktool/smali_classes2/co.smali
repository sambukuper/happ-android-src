.class public final Lco;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, Lco;->g0:B

    iput-object p1, p0, Lco;->h0:Ljava/lang/Object;

    iput-object p2, p0, Lco;->i0:Ljava/lang/Object;

    iput-object p3, p0, Lco;->j0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 17
    iput-byte p4, p0, Lco;->g0:B

    iput-object p1, p0, Lco;->i0:Ljava/lang/Object;

    iput-object p2, p0, Lco;->j0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 16
    iput-byte p5, p0, Lco;->g0:B

    iput-object p1, p0, Lco;->i0:Ljava/lang/Object;

    iput-object p2, p0, Lco;->h0:Ljava/lang/Object;

    iput-object p3, p0, Lco;->j0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/view/MenuItem;Lq51;)V
    .locals 1

    const/4 v0, 0x7

    iput-byte v0, p0, Lco;->g0:B

    .line 18
    iput-object p1, p0, Lco;->h0:Ljava/lang/Object;

    iput-object p2, p0, Lco;->j0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lqo;Ljava/lang/String;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lco;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lco;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lco;->j0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lco;->i0:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lco;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lo05;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lco;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lo05;

    .line 23
    .line 24
    check-cast p2, Lq51;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lco;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Lb71;

    .line 37
    .line 38
    check-cast p2, Lq51;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lco;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_2
    check-cast p1, Lb71;

    .line 52
    .line 53
    check-cast p2, Lq51;

    .line 54
    .line 55
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lco;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_3
    check-cast p1, Lb71;

    .line 66
    .line 67
    check-cast p2, Lq51;

    .line 68
    .line 69
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lco;

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_4
    check-cast p1, Lft7;

    .line 81
    .line 82
    check-cast p2, Lq51;

    .line 83
    .line 84
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Lco;

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :pswitch_5
    check-cast p1, Lb71;

    .line 95
    .line 96
    check-cast p2, Lq51;

    .line 97
    .line 98
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Lco;

    .line 103
    .line 104
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :pswitch_6
    check-cast p1, Lb71;

    .line 109
    .line 110
    check-cast p2, Lq51;

    .line 111
    .line 112
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lco;

    .line 117
    .line 118
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    return-object v1

    .line 122
    :pswitch_7
    check-cast p1, Lb71;

    .line 123
    .line 124
    check-cast p2, Lq51;

    .line 125
    .line 126
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Lco;

    .line 131
    .line 132
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :pswitch_8
    check-cast p1, Lb71;

    .line 138
    .line 139
    check-cast p2, Lq51;

    .line 140
    .line 141
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, Lco;

    .line 146
    .line 147
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :pswitch_9
    check-cast p1, Lb71;

    .line 152
    .line 153
    check-cast p2, Lq51;

    .line 154
    .line 155
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, Lco;

    .line 160
    .line 161
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    return-object v1

    .line 165
    :pswitch_a
    check-cast p1, Lo05;

    .line 166
    .line 167
    check-cast p2, Lq51;

    .line 168
    .line 169
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Lco;

    .line 174
    .line 175
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    return-object v1

    .line 179
    :pswitch_b
    check-cast p1, Lup0;

    .line 180
    .line 181
    iget-object p1, p1, Lup0;->a:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p2, Lq51;

    .line 184
    .line 185
    new-instance v0, Lco;

    .line 186
    .line 187
    iget-object v2, p0, Lco;->i0:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Lea6;

    .line 190
    .line 191
    iget-object p0, p0, Lco;->j0:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p0, Ljp0;

    .line 194
    .line 195
    const/4 v3, 0x4

    .line 196
    invoke-direct {v0, v2, p0, p2, v3}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 197
    .line 198
    .line 199
    iput-object p1, v0, Lco;->h0:Ljava/lang/Object;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    return-object v1

    .line 205
    :pswitch_c
    check-cast p1, Lo05;

    .line 206
    .line 207
    check-cast p2, Lq51;

    .line 208
    .line 209
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    check-cast p0, Lco;

    .line 214
    .line 215
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :pswitch_d
    check-cast p1, Lo05;

    .line 220
    .line 221
    check-cast p2, Lq51;

    .line 222
    .line 223
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    check-cast p0, Lco;

    .line 228
    .line 229
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    return-object v1

    .line 233
    :pswitch_e
    check-cast p1, Lb71;

    .line 234
    .line 235
    check-cast p2, Lq51;

    .line 236
    .line 237
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p0, Lco;

    .line 242
    .line 243
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    return-object v1

    .line 247
    :pswitch_f
    check-cast p1, Lb71;

    .line 248
    .line 249
    check-cast p2, Lq51;

    .line 250
    .line 251
    invoke-virtual {p0, p2, p1}, Lco;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    check-cast p0, Lco;

    .line 256
    .line 257
    invoke-virtual {p0, v1}, Lco;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
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
    .locals 10

    .line 1
    iget-byte v0, p0, Lco;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lco;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lco;

    .line 9
    .line 10
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lrp8;

    .line 13
    .line 14
    check-cast v1, Lzo8;

    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    invoke-direct {v0, p0, v1, p1, v2}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 19
    .line 20
    .line 21
    iput-object p2, v0, Lco;->h0:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v0, Lco;

    .line 25
    .line 26
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lrp8;

    .line 29
    .line 30
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 31
    .line 32
    const/16 v2, 0xf

    .line 33
    .line 34
    invoke-direct {v0, p0, v1, p1, v2}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 35
    .line 36
    .line 37
    iput-object p2, v0, Lco;->h0:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_1
    new-instance v0, Lco;

    .line 41
    .line 42
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lr68;

    .line 45
    .line 46
    check-cast v1, Lmq5;

    .line 47
    .line 48
    const/16 v2, 0xe

    .line 49
    .line 50
    invoke-direct {v0, p0, v1, p1, v2}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 51
    .line 52
    .line 53
    iput-object p2, v0, Lco;->h0:Ljava/lang/Object;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_2
    new-instance v0, Lco;

    .line 57
    .line 58
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Ly48;

    .line 61
    .line 62
    check-cast v1, Lmq5;

    .line 63
    .line 64
    const/16 v2, 0xd

    .line 65
    .line 66
    invoke-direct {v0, p0, v1, p1, v2}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 67
    .line 68
    .line 69
    iput-object p2, v0, Lco;->h0:Ljava/lang/Object;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_3
    new-instance v3, Lco;

    .line 73
    .line 74
    iget-object p2, p0, Lco;->h0:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v4, p2

    .line 77
    check-cast v4, Ldw7;

    .line 78
    .line 79
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v5, p0

    .line 82
    check-cast v5, Ljava/util/List;

    .line 83
    .line 84
    move-object v6, v1

    .line 85
    check-cast v6, La45;

    .line 86
    .line 87
    const/16 v8, 0xc

    .line 88
    .line 89
    move-object v7, p1

    .line 90
    invoke-direct/range {v3 .. v8}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 91
    .line 92
    .line 93
    return-object v3

    .line 94
    :pswitch_4
    move-object v8, p1

    .line 95
    new-instance p1, Lco;

    .line 96
    .line 97
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Landroid/content/Context;

    .line 100
    .line 101
    check-cast v1, Landroid/app/Activity;

    .line 102
    .line 103
    const/16 v0, 0xb

    .line 104
    .line 105
    invoke-direct {p1, p0, v1, v8, v0}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 106
    .line 107
    .line 108
    iput-object p2, p1, Lco;->h0:Ljava/lang/Object;

    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_5
    move-object v8, p1

    .line 112
    new-instance p1, Lco;

    .line 113
    .line 114
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Ld27;

    .line 117
    .line 118
    check-cast v1, Ly45;

    .line 119
    .line 120
    const/16 v0, 0xa

    .line 121
    .line 122
    invoke-direct {p1, p0, v1, v8, v0}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 123
    .line 124
    .line 125
    iput-object p2, p1, Lco;->h0:Ljava/lang/Object;

    .line 126
    .line 127
    return-object p1

    .line 128
    :pswitch_6
    move-object v8, p1

    .line 129
    new-instance p1, Lco;

    .line 130
    .line 131
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Ld27;

    .line 134
    .line 135
    check-cast v1, Llr5;

    .line 136
    .line 137
    const/16 v0, 0x9

    .line 138
    .line 139
    invoke-direct {p1, p0, v1, v8, v0}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 140
    .line 141
    .line 142
    iput-object p2, p1, Lco;->h0:Ljava/lang/Object;

    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_7
    move-object v8, p1

    .line 146
    new-instance v4, Lco;

    .line 147
    .line 148
    iget-object p1, p0, Lco;->i0:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v5, p1

    .line 151
    check-cast v5, Lvv5;

    .line 152
    .line 153
    iget-object p0, p0, Lco;->h0:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v6, p0

    .line 156
    check-cast v6, Ljava/lang/String;

    .line 157
    .line 158
    move-object v7, v1

    .line 159
    check-cast v7, Ljava/util/Map;

    .line 160
    .line 161
    const/16 v9, 0x8

    .line 162
    .line 163
    invoke-direct/range {v4 .. v9}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lq51;B)V

    .line 164
    .line 165
    .line 166
    return-object v4

    .line 167
    :pswitch_8
    move-object v8, p1

    .line 168
    new-instance p1, Lco;

    .line 169
    .line 170
    iget-object p0, p0, Lco;->h0:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p0, Ljava/lang/String;

    .line 173
    .line 174
    check-cast v1, Landroid/view/MenuItem;

    .line 175
    .line 176
    invoke-direct {p1, p0, v1, v8}, Lco;-><init>(Ljava/lang/String;Landroid/view/MenuItem;Lq51;)V

    .line 177
    .line 178
    .line 179
    iput-object p2, p1, Lco;->i0:Ljava/lang/Object;

    .line 180
    .line 181
    return-object p1

    .line 182
    :pswitch_9
    move-object v8, p1

    .line 183
    new-instance v4, Lco;

    .line 184
    .line 185
    iget-object p1, p0, Lco;->h0:Ljava/lang/Object;

    .line 186
    .line 187
    move-object v5, p1

    .line 188
    check-cast v5, Lea6;

    .line 189
    .line 190
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 191
    .line 192
    move-object v6, p0

    .line 193
    check-cast v6, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 194
    .line 195
    move-object v7, v1

    .line 196
    check-cast v7, Lsu/happ/proxyutility/ui/BaseActivity;

    .line 197
    .line 198
    const/4 v9, 0x6

    .line 199
    invoke-direct/range {v4 .. v9}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 200
    .line 201
    .line 202
    return-object v4

    .line 203
    :pswitch_a
    move-object v8, p1

    .line 204
    new-instance p1, Lco;

    .line 205
    .line 206
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p0, Ljs5;

    .line 209
    .line 210
    check-cast v1, Ljava/lang/Long;

    .line 211
    .line 212
    const/4 v0, 0x5

    .line 213
    invoke-direct {p1, p0, v1, v8, v0}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 214
    .line 215
    .line 216
    iput-object p2, p1, Lco;->h0:Ljava/lang/Object;

    .line 217
    .line 218
    return-object p1

    .line 219
    :pswitch_b
    move-object v8, p1

    .line 220
    new-instance p1, Lco;

    .line 221
    .line 222
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p0, Lea6;

    .line 225
    .line 226
    check-cast v1, Ljp0;

    .line 227
    .line 228
    const/4 v0, 0x4

    .line 229
    invoke-direct {p1, p0, v1, v8, v0}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 230
    .line 231
    .line 232
    check-cast p2, Lup0;

    .line 233
    .line 234
    iget-object p0, p2, Lup0;->a:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object p0, p1, Lco;->h0:Ljava/lang/Object;

    .line 237
    .line 238
    return-object p1

    .line 239
    :pswitch_c
    move-object v8, p1

    .line 240
    new-instance p1, Lco;

    .line 241
    .line 242
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, Lqc2;

    .line 245
    .line 246
    check-cast v1, Ljava/util/Set;

    .line 247
    .line 248
    const/4 v0, 0x3

    .line 249
    invoke-direct {p1, p0, v1, v8, v0}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 250
    .line 251
    .line 252
    iput-object p2, p1, Lco;->h0:Ljava/lang/Object;

    .line 253
    .line 254
    return-object p1

    .line 255
    :pswitch_d
    move-object v8, p1

    .line 256
    new-instance p1, Lco;

    .line 257
    .line 258
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p0, Lqc2;

    .line 261
    .line 262
    check-cast v1, Lld6;

    .line 263
    .line 264
    const/4 v0, 0x2

    .line 265
    invoke-direct {p1, p0, v1, v8, v0}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 266
    .line 267
    .line 268
    iput-object p2, p1, Lco;->h0:Ljava/lang/Object;

    .line 269
    .line 270
    return-object p1

    .line 271
    :pswitch_e
    move-object v8, p1

    .line 272
    new-instance v4, Lco;

    .line 273
    .line 274
    iget-object p1, p0, Lco;->i0:Ljava/lang/Object;

    .line 275
    .line 276
    move-object v5, p1

    .line 277
    check-cast v5, Landroid/content/Context;

    .line 278
    .line 279
    iget-object p0, p0, Lco;->h0:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v6, p0

    .line 282
    check-cast v6, Ljava/lang/String;

    .line 283
    .line 284
    move-object v7, v1

    .line 285
    check-cast v7, Lnn1;

    .line 286
    .line 287
    const/4 v9, 0x1

    .line 288
    invoke-direct/range {v4 .. v9}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lq51;B)V

    .line 289
    .line 290
    .line 291
    return-object v4

    .line 292
    :pswitch_f
    move-object v8, p1

    .line 293
    new-instance p1, Lco;

    .line 294
    .line 295
    iget-object p2, p0, Lco;->h0:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p2, Ljava/lang/String;

    .line 298
    .line 299
    check-cast v1, Lqo;

    .line 300
    .line 301
    iget-object p0, p0, Lco;->i0:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p0, Ljava/lang/String;

    .line 304
    .line 305
    invoke-direct {p1, p2, v1, p0, v8}, Lco;-><init>(Ljava/lang/String;Lqo;Ljava/lang/String;Lq51;)V

    .line 306
    .line 307
    .line 308
    return-object p1

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
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
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lco;->g0:B

    .line 4
    .line 5
    sget-object v2, Lec7;->Y:Lec7;

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    sget-object v4, Le71;->f0:Le71;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    sget-object v9, Ldn8;->a:Ldn8;

    .line 15
    .line 16
    iget-object v10, v0, Lco;->j0:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lo05;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lrp8;

    .line 31
    .line 32
    iget-object v0, v0, Lrp8;->b:Ljs5;

    .line 33
    .line 34
    sget-object v2, Lmr;->a:Lcp3;

    .line 35
    .line 36
    check-cast v10, Lzo8;

    .line 37
    .line 38
    iget-object v3, v2, Lvm3;->b:Lg55;

    .line 39
    .line 40
    sget-object v3, Lzo8;->Companion:Lyo8;

    .line 41
    .line 42
    invoke-virtual {v3}, Lyo8;->serializer()Low3;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Low3;

    .line 47
    .line 48
    invoke-virtual {v2, v3, v10}, Lvm3;->b(Low3;Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v0, v2}, Lo05;->e(Ljs5;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v9

    .line 56
    :pswitch_0
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lo05;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lrp8;

    .line 66
    .line 67
    iget-object v0, v0, Lrp8;->c:Ljs5;

    .line 68
    .line 69
    sget-object v2, Lmr;->a:Lcp3;

    .line 70
    .line 71
    check-cast v10, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 72
    .line 73
    iget-object v3, v2, Lvm3;->b:Lg55;

    .line 74
    .line 75
    sget-object v3, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;->Companion:Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo$Companion;

    .line 76
    .line 77
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo$Companion;->serializer()Low3;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Low3;

    .line 82
    .line 83
    invoke-virtual {v2, v3, v10}, Lvm3;->b(Low3;Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v1, v0, v2}, Lo05;->e(Ljs5;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v9

    .line 91
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lb71;

    .line 97
    .line 98
    new-instance v2, Lw48;

    .line 99
    .line 100
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lr68;

    .line 103
    .line 104
    check-cast v10, Lmq5;

    .line 105
    .line 106
    invoke-direct {v2, v0, v10, v8, v7}, Lw48;-><init>(Lr68;Lmq5;Lq51;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v8, v4, v2, v7}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 110
    .line 111
    .line 112
    new-instance v2, Lw48;

    .line 113
    .line 114
    invoke-direct {v2, v0, v10, v8, v5}, Lw48;-><init>(Lr68;Lmq5;Lq51;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1, v8, v4, v2, v7}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 118
    .line 119
    .line 120
    new-instance v2, Lw48;

    .line 121
    .line 122
    invoke-direct {v2, v10, v0, v8}, Lw48;-><init>(Lmq5;Lr68;Lq51;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v8, v4, v2, v7}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Lb71;

    .line 136
    .line 137
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v12, v0

    .line 140
    check-cast v12, Ly48;

    .line 141
    .line 142
    iget-object v14, v12, Ly48;->u0:Lr68;

    .line 143
    .line 144
    move-object v15, v10

    .line 145
    check-cast v15, Lmq5;

    .line 146
    .line 147
    new-instance v0, La23;

    .line 148
    .line 149
    const/16 v2, 0x1b

    .line 150
    .line 151
    invoke-direct {v0, v14, v12, v2}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    new-instance v2, Lw48;

    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    invoke-direct {v2, v14, v15, v3, v6}, Lw48;-><init>(Lr68;Lmq5;Lq51;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v3, v4, v2, v7}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 161
    .line 162
    .line 163
    new-instance v11, Lpi;

    .line 164
    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    const/16 v17, 0x13

    .line 168
    .line 169
    move-object v13, v14

    .line 170
    move-object v14, v15

    .line 171
    move-object v15, v0

    .line 172
    invoke-direct/range {v11 .. v17}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v16, v15

    .line 176
    .line 177
    move-object v15, v14

    .line 178
    move-object v14, v13

    .line 179
    invoke-static {v1, v3, v4, v11, v7}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 180
    .line 181
    .line 182
    new-instance v13, Lqk4;

    .line 183
    .line 184
    const/16 v18, 0x16

    .line 185
    .line 186
    move-object/from16 v17, v3

    .line 187
    .line 188
    invoke-direct/range {v13 .. v18}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 189
    .line 190
    .line 191
    move-object/from16 v0, v17

    .line 192
    .line 193
    invoke-static {v1, v0, v4, v13, v7}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 194
    .line 195
    .line 196
    return-object v9

    .line 197
    :pswitch_3
    iget-object v1, v0, Lco;->i0:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, Ljava/util/List;

    .line 200
    .line 201
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, v0, Lco;->h0:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Ldw7;

    .line 207
    .line 208
    iget-object v4, v0, Ldw7;->d:Luv7;

    .line 209
    .line 210
    iget-object v9, v0, Ldw7;->s:Lvz7;

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_1

    .line 217
    .line 218
    if-ne v4, v7, :cond_0

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_20

    .line 225
    .line 226
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    if-eqz v11, :cond_4

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    move-object v12, v11

    .line 246
    check-cast v12, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 247
    .line 248
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    if-eqz v12, :cond_3

    .line 253
    .line 254
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-static {v12, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    goto :goto_1

    .line 265
    :cond_3
    move v12, v6

    .line 266
    :goto_1
    if-nez v12, :cond_2

    .line 267
    .line 268
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_0

    .line 272
    :cond_4
    move-object v1, v4

    .line 273
    :goto_2
    check-cast v10, La45;

    .line 274
    .line 275
    iget-object v4, v0, Ldw7;->r:Lvz7;

    .line 276
    .line 277
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    check-cast v4, Lcom/tencent/mmkv/MMKV;

    .line 282
    .line 283
    const-string v11, "pref_ping_result"

    .line 284
    .line 285
    invoke-virtual {v4, v3, v11}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    sget-object v11, Lvn5;->X:Lwe5;

    .line 290
    .line 291
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    sget-object v11, Lvn5;->g0:Ln22;

    .line 295
    .line 296
    invoke-static {v4, v11}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    check-cast v4, Lvn5;

    .line 301
    .line 302
    if-nez v4, :cond_5

    .line 303
    .line 304
    sget-object v4, Lvn5;->Y:Lvn5;

    .line 305
    .line 306
    :cond_5
    new-instance v11, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    move v12, v6

    .line 316
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v13

    .line 320
    if-eqz v13, :cond_26

    .line 321
    .line 322
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v13

    .line 326
    add-int/lit8 v14, v12, 0x1

    .line 327
    .line 328
    if-ltz v12, :cond_25

    .line 329
    .line 330
    move-object v15, v13

    .line 331
    check-cast v15, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 332
    .line 333
    new-instance v13, Lzt4;

    .line 334
    .line 335
    invoke-direct {v13, v0, v15, v4, v7}, Lzt4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 336
    .line 337
    .line 338
    move-object/from16 v21, v8

    .line 339
    .line 340
    invoke-static {}, Li21;->r()Lgb4;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    iget-object v3, v0, Ldw7;->e:Lmh7;

    .line 352
    .line 353
    if-eqz v3, :cond_8

    .line 354
    .line 355
    invoke-interface {v3}, Lmh7;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    check-cast v3, Lc83;

    .line 360
    .line 361
    if-eqz v3, :cond_8

    .line 362
    .line 363
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v16

    .line 371
    if-eqz v16, :cond_7

    .line 372
    .line 373
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v16

    .line 377
    move-object/from16 v6, v16

    .line 378
    .line 379
    check-cast v6, Lnv7;

    .line 380
    .line 381
    move/from16 v22, v7

    .line 382
    .line 383
    new-instance v7, Lmv7;

    .line 384
    .line 385
    invoke-direct {v7, v5}, Lmv7;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    if-eqz v6, :cond_6

    .line 393
    .line 394
    goto :goto_5

    .line 395
    :cond_6
    move/from16 v7, v22

    .line 396
    .line 397
    const/4 v6, 0x0

    .line 398
    goto :goto_4

    .line 399
    :cond_7
    move/from16 v22, v7

    .line 400
    .line 401
    move-object/from16 v16, v21

    .line 402
    .line 403
    :goto_5
    check-cast v16, Lnv7;

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_8
    move/from16 v22, v7

    .line 407
    .line 408
    move-object/from16 v16, v21

    .line 409
    .line 410
    :goto_6
    if-eqz v16, :cond_9

    .line 411
    .line 412
    move/from16 v3, v22

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_9
    const/4 v3, 0x0

    .line 416
    :goto_7
    if-eqz v12, :cond_a

    .line 417
    .line 418
    sget-object v5, Lsv7;->a:Lsv7;

    .line 419
    .line 420
    invoke-virtual {v8, v5}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    :cond_a
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 424
    .line 425
    .line 426
    move-result-object v23

    .line 427
    if-eqz v23, :cond_c

    .line 428
    .line 429
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 434
    .line 435
    .line 436
    move-result-object v24

    .line 437
    if-eqz v24, :cond_b

    .line 438
    .line 439
    const/16 v33, -0x1

    .line 440
    .line 441
    const v34, 0xfffffff

    .line 442
    .line 443
    .line 444
    const/16 v25, 0x0

    .line 445
    .line 446
    const/16 v26, 0x0

    .line 447
    .line 448
    const/16 v27, 0x0

    .line 449
    .line 450
    const/16 v28, 0x0

    .line 451
    .line 452
    const/16 v29, 0x0

    .line 453
    .line 454
    const/16 v30, 0x0

    .line 455
    .line 456
    const/16 v31, 0x0

    .line 457
    .line 458
    const/16 v32, -0x1

    .line 459
    .line 460
    invoke-static/range {v24 .. v34}, Lsu/happ/proxyutility/dto/MetaParams;->c(Lsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Lsu/happ/proxyutility/dto/enums/SubInfoColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;III)Lsu/happ/proxyutility/dto/MetaParams;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    move-object/from16 v27, v5

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_b
    move-object/from16 v27, v21

    .line 468
    .line 469
    :goto_8
    const/16 v29, 0x0

    .line 470
    .line 471
    const v30, 0xff7ffff

    .line 472
    .line 473
    .line 474
    const-wide/16 v24, 0x0

    .line 475
    .line 476
    const/16 v26, 0x0

    .line 477
    .line 478
    const/16 v28, 0x0

    .line 479
    .line 480
    invoke-static/range {v23 .. v30}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    move-object/from16 v16, v5

    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_c
    move-object/from16 v16, v21

    .line 488
    .line 489
    :goto_9
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    invoke-static {v5}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 494
    .line 495
    .line 496
    move-result-object v17

    .line 497
    const/16 v19, 0x0

    .line 498
    .line 499
    const/16 v20, 0x19

    .line 500
    .line 501
    const/16 v18, 0x0

    .line 502
    .line 503
    invoke-static/range {v15 .. v20}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->a(Lsu/happ/proxyutility/dto/ConfigGroupCache;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/util/ArrayList;ZZI)Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 504
    .line 505
    .line 506
    move-result-object v17

    .line 507
    iget-object v5, v0, Ldw7;->t:Lvz7;

    .line 508
    .line 509
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    check-cast v5, Lpv0;

    .line 514
    .line 515
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    iget-object v5, v5, Lpv0;->a:Lvz7;

    .line 526
    .line 527
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    check-cast v5, Lzt7;

    .line 532
    .line 533
    invoke-virtual {v5, v6}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    if-eqz v5, :cond_d

    .line 538
    .line 539
    iget-boolean v5, v5, Lqs7;->e:Z

    .line 540
    .line 541
    if-nez v5, :cond_d

    .line 542
    .line 543
    move/from16 v5, v22

    .line 544
    .line 545
    goto :goto_a

    .line 546
    :cond_d
    const/4 v5, 0x0

    .line 547
    :goto_a
    xor-int/lit8 v19, v5, 0x1

    .line 548
    .line 549
    invoke-virtual {v9}, Lvz7;->getValue()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v5

    .line 553
    check-cast v5, Lzt7;

    .line 554
    .line 555
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    invoke-virtual {v5, v6}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    if-eqz v5, :cond_f

    .line 564
    .line 565
    iget-object v5, v5, Lqs7;->a:Lis7;

    .line 566
    .line 567
    if-eqz v5, :cond_f

    .line 568
    .line 569
    iget-boolean v6, v5, Lis7;->a:Z

    .line 570
    .line 571
    if-eqz v6, :cond_e

    .line 572
    .line 573
    iget v5, v5, Lis7;->c:I

    .line 574
    .line 575
    new-instance v6, Ljava/lang/Integer;

    .line 576
    .line 577
    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 578
    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_e
    move-object/from16 v6, v21

    .line 582
    .line 583
    :goto_b
    move-object/from16 v20, v6

    .line 584
    .line 585
    :goto_c
    move-object/from16 v16, v15

    .line 586
    .line 587
    goto :goto_d

    .line 588
    :cond_f
    move-object/from16 v20, v21

    .line 589
    .line 590
    goto :goto_c

    .line 591
    :goto_d
    new-instance v15, Lrv7;

    .line 592
    .line 593
    move/from16 v18, v3

    .line 594
    .line 595
    invoke-direct/range {v15 .. v20}, Lrv7;-><init>(Lsu/happ/proxyutility/dto/ConfigGroupCache;Lsu/happ/proxyutility/dto/ConfigGroupCache;ZZLjava/lang/Integer;)V

    .line 596
    .line 597
    .line 598
    move-object v3, v15

    .line 599
    move-object/from16 v15, v16

    .line 600
    .line 601
    invoke-virtual {v8, v3}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->e()Z

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    if-eqz v3, :cond_1a

    .line 609
    .line 610
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    invoke-virtual {v9}, Lvz7;->getValue()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    check-cast v5, Lzt7;

    .line 619
    .line 620
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    invoke-static {v3}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 627
    .line 628
    .line 629
    move-result-object v5

    .line 630
    if-eqz v5, :cond_10

    .line 631
    .line 632
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    move/from16 v6, v22

    .line 637
    .line 638
    if-ne v5, v6, :cond_11

    .line 639
    .line 640
    move v5, v6

    .line 641
    goto :goto_e

    .line 642
    :cond_10
    move/from16 v6, v22

    .line 643
    .line 644
    :cond_11
    const/4 v5, 0x0

    .line 645
    :goto_e
    if-nez v5, :cond_12

    .line 646
    .line 647
    :goto_f
    move-object/from16 v3, v21

    .line 648
    .line 649
    goto :goto_11

    .line 650
    :cond_12
    if-ne v5, v6, :cond_24

    .line 651
    .line 652
    invoke-virtual {v9}, Lvz7;->getValue()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    check-cast v5, Lzt7;

    .line 657
    .line 658
    invoke-virtual {v5, v3}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    if-eqz v3, :cond_13

    .line 663
    .line 664
    iget-boolean v3, v3, Lqs7;->f:Z

    .line 665
    .line 666
    goto :goto_10

    .line 667
    :cond_13
    const/4 v3, 0x0

    .line 668
    :goto_10
    if-eqz v3, :cond_14

    .line 669
    .line 670
    goto :goto_f

    .line 671
    :cond_14
    move-object v3, v10

    .line 672
    :goto_11
    invoke-virtual {v15}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    new-instance v6, Lvv7;

    .line 681
    .line 682
    const/4 v7, 0x0

    .line 683
    invoke-direct {v6, v2, v7}, Lvv7;-><init>(Lj2;Z)V

    .line 684
    .line 685
    .line 686
    :goto_12
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v7

    .line 693
    if-eqz v7, :cond_15

    .line 694
    .line 695
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v7

    .line 699
    goto :goto_13

    .line 700
    :cond_15
    move-object/from16 v7, v21

    .line 701
    .line 702
    :goto_13
    check-cast v7, Lsu/happ/proxyutility/dto/ServerCache;

    .line 703
    .line 704
    iget-boolean v12, v6, Lvv7;->b:Z

    .line 705
    .line 706
    iget-object v6, v6, Lvv7;->a:Lj2;

    .line 707
    .line 708
    if-nez v7, :cond_1b

    .line 709
    .line 710
    iget-object v5, v0, Ldw7;->d:Luv7;

    .line 711
    .line 712
    sget-object v7, Luv7;->Y:Luv7;

    .line 713
    .line 714
    if-ne v5, v7, :cond_16

    .line 715
    .line 716
    if-eqz v3, :cond_16

    .line 717
    .line 718
    if-eqz v12, :cond_16

    .line 719
    .line 720
    new-instance v5, Lov7;

    .line 721
    .line 722
    invoke-virtual {v6}, Lz0;->isEmpty()Z

    .line 723
    .line 724
    .line 725
    move-result v7

    .line 726
    invoke-direct {v5, v3, v7}, Lov7;-><init>(La45;Z)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v8, v5}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    :cond_16
    invoke-static {v6}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    check-cast v3, Lsu/happ/proxyutility/dto/ServerCache;

    .line 737
    .line 738
    if-eqz v3, :cond_18

    .line 739
    .line 740
    invoke-virtual {v6}, Lz0;->a()I

    .line 741
    .line 742
    .line 743
    move-result v5

    .line 744
    const/4 v7, 0x1

    .line 745
    if-ne v5, v7, :cond_17

    .line 746
    .line 747
    move v5, v7

    .line 748
    goto :goto_14

    .line 749
    :cond_17
    const/4 v5, 0x0

    .line 750
    :goto_14
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 751
    .line 752
    .line 753
    move-result-object v5

    .line 754
    invoke-virtual {v13, v3, v5}, Lzt4;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    invoke-virtual {v8, v3}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    goto :goto_15

    .line 762
    :cond_18
    const/4 v7, 0x1

    .line 763
    :goto_15
    invoke-virtual {v6}, Lz0;->a()I

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    invoke-static {v7, v3}, Lx97;->a0(II)Lkf3;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    invoke-virtual {v3}, Lif3;->iterator()Ljava/util/Iterator;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    :goto_16
    move-object v5, v3

    .line 776
    check-cast v5, Ljf3;

    .line 777
    .line 778
    iget-boolean v12, v5, Ljf3;->Z:Z

    .line 779
    .line 780
    if-eqz v12, :cond_1a

    .line 781
    .line 782
    invoke-virtual {v5}, Ljf3;->nextInt()I

    .line 783
    .line 784
    .line 785
    move-result v5

    .line 786
    sget-object v12, Lqv7;->a:Lqv7;

    .line 787
    .line 788
    invoke-virtual {v8, v12}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v12

    .line 795
    invoke-virtual {v6}, Lz0;->a()I

    .line 796
    .line 797
    .line 798
    move-result v15

    .line 799
    sub-int/2addr v15, v7

    .line 800
    if-ne v5, v15, :cond_19

    .line 801
    .line 802
    const/4 v5, 0x1

    .line 803
    goto :goto_17

    .line 804
    :cond_19
    const/4 v5, 0x0

    .line 805
    :goto_17
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 806
    .line 807
    .line 808
    move-result-object v5

    .line 809
    invoke-virtual {v13, v12, v5}, Lzt4;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    invoke-virtual {v8, v5}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    const/4 v7, 0x1

    .line 817
    goto :goto_16

    .line 818
    :cond_1a
    move-object/from16 p0, v0

    .line 819
    .line 820
    move-object/from16 p1, v1

    .line 821
    .line 822
    move-object/from16 v16, v2

    .line 823
    .line 824
    goto/16 :goto_1f

    .line 825
    .line 826
    :cond_1b
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->e()Z

    .line 827
    .line 828
    .line 829
    move-result v15

    .line 830
    if-nez v3, :cond_1c

    .line 831
    .line 832
    move-object/from16 p0, v0

    .line 833
    .line 834
    const/4 v0, -0x1

    .line 835
    :goto_18
    move-object/from16 p1, v1

    .line 836
    .line 837
    const/4 v1, -0x1

    .line 838
    goto :goto_19

    .line 839
    :cond_1c
    sget-object v16, Lbw7;->a:[I

    .line 840
    .line 841
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 842
    .line 843
    .line 844
    move-result v17

    .line 845
    aget v16, v16, v17

    .line 846
    .line 847
    move-object/from16 p0, v0

    .line 848
    .line 849
    move/from16 v0, v16

    .line 850
    .line 851
    goto :goto_18

    .line 852
    :goto_19
    if-eq v0, v1, :cond_20

    .line 853
    .line 854
    const/4 v1, 0x1

    .line 855
    if-eq v0, v1, :cond_1f

    .line 856
    .line 857
    const/4 v1, 0x2

    .line 858
    if-ne v0, v1, :cond_1e

    .line 859
    .line 860
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->c()Lsu/happ/proxyutility/dto/ServerConfig;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    const-string v1, "only wifi"

    .line 869
    .line 870
    move-object/from16 v16, v2

    .line 871
    .line 872
    const/4 v2, 0x1

    .line 873
    invoke-static {v0, v1, v2}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    if-nez v0, :cond_1d

    .line 878
    .line 879
    goto :goto_1c

    .line 880
    :cond_1d
    const/4 v2, 0x0

    .line 881
    goto :goto_1c

    .line 882
    :cond_1e
    invoke-static {}, Lb61;->c()V

    .line 883
    .line 884
    .line 885
    :goto_1a
    move-object/from16 v8, v21

    .line 886
    .line 887
    goto/16 :goto_20

    .line 888
    .line 889
    :cond_1f
    move-object/from16 v16, v2

    .line 890
    .line 891
    move v2, v1

    .line 892
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->c()Lsu/happ/proxyutility/dto/ServerConfig;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    const-string v1, "only mobile"

    .line 901
    .line 902
    invoke-static {v0, v1, v2}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    if-nez v0, :cond_1d

    .line 907
    .line 908
    :goto_1b
    const/4 v2, 0x1

    .line 909
    goto :goto_1c

    .line 910
    :cond_20
    move-object/from16 v16, v2

    .line 911
    .line 912
    goto :goto_1b

    .line 913
    :goto_1c
    if-eqz v2, :cond_21

    .line 914
    .line 915
    invoke-virtual {v6, v7}, Lj2;->b(Lsu/happ/proxyutility/dto/ServerCache;)Lj2;

    .line 916
    .line 917
    .line 918
    move-result-object v6

    .line 919
    :cond_21
    if-nez v12, :cond_23

    .line 920
    .line 921
    if-eqz v15, :cond_22

    .line 922
    .line 923
    if-nez v2, :cond_22

    .line 924
    .line 925
    goto :goto_1d

    .line 926
    :cond_22
    const/4 v0, 0x0

    .line 927
    goto :goto_1e

    .line 928
    :cond_23
    :goto_1d
    const/4 v0, 0x1

    .line 929
    :goto_1e
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 930
    .line 931
    .line 932
    new-instance v1, Lvv7;

    .line 933
    .line 934
    invoke-direct {v1, v6, v0}, Lvv7;-><init>(Lj2;Z)V

    .line 935
    .line 936
    .line 937
    move-object/from16 v0, p0

    .line 938
    .line 939
    move-object v6, v1

    .line 940
    move-object/from16 v2, v16

    .line 941
    .line 942
    move-object/from16 v1, p1

    .line 943
    .line 944
    goto/16 :goto_12

    .line 945
    .line 946
    :cond_24
    invoke-static {}, Lb61;->c()V

    .line 947
    .line 948
    .line 949
    goto :goto_1a

    .line 950
    :goto_1f
    invoke-static {v8}, Li21;->j(Lgb4;)Lgb4;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    invoke-static {v11, v0}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 955
    .line 956
    .line 957
    move-object/from16 v0, p0

    .line 958
    .line 959
    move-object/from16 v1, p1

    .line 960
    .line 961
    move v12, v14

    .line 962
    move-object/from16 v2, v16

    .line 963
    .line 964
    move-object/from16 v8, v21

    .line 965
    .line 966
    const/4 v3, -0x1

    .line 967
    const/4 v5, 0x2

    .line 968
    const/4 v6, 0x0

    .line 969
    const/4 v7, 0x1

    .line 970
    goto/16 :goto_3

    .line 971
    .line 972
    :cond_25
    move-object/from16 v21, v8

    .line 973
    .line 974
    invoke-static {}, Li21;->X()V

    .line 975
    .line 976
    .line 977
    throw v21

    .line 978
    :cond_26
    move-object v8, v11

    .line 979
    :goto_20
    return-object v8

    .line 980
    :pswitch_4
    move-object/from16 v21, v8

    .line 981
    .line 982
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v1, Lft7;

    .line 985
    .line 986
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 987
    .line 988
    .line 989
    if-eqz v1, :cond_28

    .line 990
    .line 991
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v0, Landroid/content/Context;

    .line 994
    .line 995
    const/16 v1, 0x81

    .line 996
    .line 997
    invoke-static {v0, v1}, Lqe4;->O0(Landroid/content/Context;I)V

    .line 998
    .line 999
    .line 1000
    check-cast v10, Landroid/app/Activity;

    .line 1001
    .line 1002
    if-eqz v10, :cond_27

    .line 1003
    .line 1004
    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    .line 1005
    .line 1006
    .line 1007
    :cond_27
    move-object v8, v9

    .line 1008
    goto :goto_21

    .line 1009
    :cond_28
    invoke-static {}, Lb61;->c()V

    .line 1010
    .line 1011
    .line 1012
    move-object/from16 v8, v21

    .line 1013
    .line 1014
    :goto_21
    return-object v8

    .line 1015
    :pswitch_5
    move-object/from16 v21, v8

    .line 1016
    .line 1017
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v1, Lb71;

    .line 1020
    .line 1021
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1022
    .line 1023
    .line 1024
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1025
    .line 1026
    check-cast v0, Ld27;

    .line 1027
    .line 1028
    iget-object v2, v0, Ld27;->c:Log7;

    .line 1029
    .line 1030
    move-object/from16 v3, v21

    .line 1031
    .line 1032
    if-eqz v2, :cond_29

    .line 1033
    .line 1034
    invoke-virtual {v2, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 1035
    .line 1036
    .line 1037
    :cond_29
    new-instance v2, Lpi;

    .line 1038
    .line 1039
    check-cast v10, Ly45;

    .line 1040
    .line 1041
    const/16 v4, 0x11

    .line 1042
    .line 1043
    invoke-direct {v2, v10, v0, v3, v4}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 1044
    .line 1045
    .line 1046
    const/4 v4, 0x3

    .line 1047
    invoke-static {v1, v3, v2, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    iput-object v1, v0, Ld27;->c:Log7;

    .line 1052
    .line 1053
    return-object v9

    .line 1054
    :pswitch_6
    move-object v3, v8

    .line 1055
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast v1, Lb71;

    .line 1058
    .line 1059
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1060
    .line 1061
    .line 1062
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v0, Ld27;

    .line 1065
    .line 1066
    iget-object v2, v0, Ld27;->c:Log7;

    .line 1067
    .line 1068
    if-eqz v2, :cond_2a

    .line 1069
    .line 1070
    invoke-virtual {v2, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 1071
    .line 1072
    .line 1073
    :cond_2a
    sget-object v2, Ltp1;->a:Lnf1;

    .line 1074
    .line 1075
    sget-object v2, Lye1;->Z:Lye1;

    .line 1076
    .line 1077
    new-instance v4, Lqi;

    .line 1078
    .line 1079
    check-cast v10, Llr5;

    .line 1080
    .line 1081
    invoke-direct {v4, v10, v0, v3}, Lqi;-><init>(Llr5;Ld27;Lq51;)V

    .line 1082
    .line 1083
    .line 1084
    const/4 v3, 0x2

    .line 1085
    invoke-static {v1, v2, v4, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    iput-object v1, v0, Ld27;->c:Log7;

    .line 1090
    .line 1091
    return-object v9

    .line 1092
    :pswitch_7
    move-object/from16 v16, v2

    .line 1093
    .line 1094
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1095
    .line 1096
    .line 1097
    iget-object v1, v0, Lco;->i0:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v1, Lvv5;

    .line 1100
    .line 1101
    iget-object v2, v1, Lvv5;->b:Lvz7;

    .line 1102
    .line 1103
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    check-cast v2, Lmn6;

    .line 1108
    .line 1109
    iget-object v2, v2, Lmn6;->g:Lh76;

    .line 1110
    .line 1111
    iget-object v2, v2, Lh76;->X:Loh7;

    .line 1112
    .line 1113
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    check-cast v2, Ljava/util/Map;

    .line 1118
    .line 1119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v2

    .line 1126
    check-cast v2, Ljava/lang/Iterable;

    .line 1127
    .line 1128
    invoke-static {v2}, Lwv0;->l0(Ljava/lang/Iterable;)Lhu;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    iget-object v0, v0, Lco;->h0:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v0, Ljava/lang/String;

    .line 1135
    .line 1136
    new-instance v3, Lm40;

    .line 1137
    .line 1138
    const/16 v4, 0x12

    .line 1139
    .line 1140
    invoke-direct {v3, v0, v4}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 1141
    .line 1142
    .line 1143
    new-instance v0, Lla2;

    .line 1144
    .line 1145
    const/4 v6, 0x1

    .line 1146
    invoke-direct {v0, v2, v6, v3}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 1147
    .line 1148
    .line 1149
    check-cast v10, Ljava/util/Map;

    .line 1150
    .line 1151
    new-instance v2, Luv5;

    .line 1152
    .line 1153
    const/4 v7, 0x0

    .line 1154
    invoke-direct {v2, v10, v7}, Luv5;-><init>(Ljava/util/Map;B)V

    .line 1155
    .line 1156
    .line 1157
    new-instance v3, Lsd2;

    .line 1158
    .line 1159
    sget-object v4, Lz27;->X:Lz27;

    .line 1160
    .line 1161
    invoke-direct {v3, v0, v2, v4}, Lsd2;-><init>(Lu27;Lgn2;Lgn2;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual/range {v16 .. v16}, Lec7;->c()Lqm5;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    new-instance v2, Lrd2;

    .line 1169
    .line 1170
    invoke-direct {v2, v3}, Lrd2;-><init>(Lsd2;)V

    .line 1171
    .line 1172
    .line 1173
    :cond_2b
    :goto_22
    invoke-virtual {v2}, Lrd2;->hasNext()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v3

    .line 1177
    if-eqz v3, :cond_2c

    .line 1178
    .line 1179
    invoke-virtual {v2}, Lrd2;->next()Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v3

    .line 1183
    move-object v4, v3

    .line 1184
    check-cast v4, Lom6;

    .line 1185
    .line 1186
    iget-object v5, v1, Lvv5;->b:Lvz7;

    .line 1187
    .line 1188
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v5

    .line 1192
    check-cast v5, Lmn6;

    .line 1193
    .line 1194
    iget-object v6, v4, Lom6;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 1195
    .line 1196
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v6

    .line 1200
    iget-object v4, v4, Lom6;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 1201
    .line 1202
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v4

    .line 1206
    invoke-virtual {v5, v6, v4}, Lmn6;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v4

    .line 1210
    if-nez v4, :cond_2b

    .line 1211
    .line 1212
    invoke-virtual {v0, v3}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 1213
    .line 1214
    .line 1215
    goto :goto_22

    .line 1216
    :cond_2c
    invoke-virtual {v0}, Lqm5;->c()Lj2;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    return-object v0

    .line 1221
    :pswitch_8
    move-object v3, v8

    .line 1222
    iget-object v1, v0, Lco;->i0:Ljava/lang/Object;

    .line 1223
    .line 1224
    check-cast v1, Lb71;

    .line 1225
    .line 1226
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1227
    .line 1228
    .line 1229
    iget-object v0, v0, Lco;->h0:Ljava/lang/Object;

    .line 1230
    .line 1231
    check-cast v0, Ljava/lang/String;

    .line 1232
    .line 1233
    check-cast v10, Landroid/view/MenuItem;

    .line 1234
    .line 1235
    if-eqz v0, :cond_30

    .line 1236
    .line 1237
    sget-object v1, Lkw4;->a:Lkw4;

    .line 1238
    .line 1239
    invoke-static {v0}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    if-eqz v0, :cond_2d

    .line 1244
    .line 1245
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->i()Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    invoke-static {v0}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v8

    .line 1253
    goto :goto_23

    .line 1254
    :cond_2d
    move-object v8, v3

    .line 1255
    :goto_23
    if-eqz v8, :cond_2f

    .line 1256
    .line 1257
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 1258
    .line 1259
    .line 1260
    move-result v0

    .line 1261
    const/4 v6, 0x1

    .line 1262
    if-ne v0, v6, :cond_2f

    .line 1263
    .line 1264
    sget-object v0, Lss8;->a:Lss8;

    .line 1265
    .line 1266
    invoke-static {}, Lss8;->t()Z

    .line 1267
    .line 1268
    .line 1269
    move-result v0

    .line 1270
    if-eqz v0, :cond_2e

    .line 1271
    .line 1272
    goto :goto_24

    .line 1273
    :cond_2e
    const/4 v6, 0x0

    .line 1274
    goto :goto_25

    .line 1275
    :cond_2f
    :goto_24
    const/4 v6, 0x1

    .line 1276
    :goto_25
    invoke-interface {v10, v6}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1277
    .line 1278
    .line 1279
    goto :goto_26

    .line 1280
    :cond_30
    const/4 v6, 0x1

    .line 1281
    invoke-interface {v10, v6}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1282
    .line 1283
    .line 1284
    :goto_26
    return-object v9

    .line 1285
    :pswitch_9
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1286
    .line 1287
    .line 1288
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1289
    .line 1290
    check-cast v1, Lea6;

    .line 1291
    .line 1292
    iget-object v2, v1, Lea6;->X:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v2, Lmo1;

    .line 1295
    .line 1296
    if-eqz v2, :cond_31

    .line 1297
    .line 1298
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1299
    .line 1300
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 1301
    .line 1302
    sget v3, Ly46;->test_title:I

    .line 1303
    .line 1304
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1309
    .line 1310
    .line 1311
    iput-object v0, v2, Lmo1;->C1:Ljava/lang/String;

    .line 1312
    .line 1313
    iget-object v2, v2, Lmo1;->z1:Landroid/widget/TextView;

    .line 1314
    .line 1315
    if-eqz v2, :cond_31

    .line 1316
    .line 1317
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1318
    .line 1319
    .line 1320
    :cond_31
    iget-object v0, v1, Lea6;->X:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v0, Lmo1;

    .line 1323
    .line 1324
    if-eqz v0, :cond_32

    .line 1325
    .line 1326
    new-instance v2, Lul4;

    .line 1327
    .line 1328
    const/4 v7, 0x0

    .line 1329
    invoke-direct {v2, v1, v7}, Lul4;-><init>(Lea6;B)V

    .line 1330
    .line 1331
    .line 1332
    iput-object v2, v0, Lmo1;->E1:Ldn2;

    .line 1333
    .line 1334
    :cond_32
    if-eqz v0, :cond_33

    .line 1335
    .line 1336
    new-instance v1, Lsh4;

    .line 1337
    .line 1338
    const/4 v2, 0x7

    .line 1339
    invoke-direct {v1, v2}, Lsh4;-><init>(B)V

    .line 1340
    .line 1341
    .line 1342
    iput-object v1, v0, Lmo1;->F1:Ldn2;

    .line 1343
    .line 1344
    :cond_33
    if-eqz v0, :cond_34

    .line 1345
    .line 1346
    check-cast v10, Lsu/happ/proxyutility/ui/BaseActivity;

    .line 1347
    .line 1348
    const-string v1, "DialogTest"

    .line 1349
    .line 1350
    invoke-static {v10, v0, v1}, Ld8;->a0(Lsu/happ/proxyutility/ui/BaseActivity;Lsn1;Ljava/lang/String;)V

    .line 1351
    .line 1352
    .line 1353
    :cond_34
    return-object v9

    .line 1354
    :pswitch_a
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1358
    .line 1359
    check-cast v1, Lo05;

    .line 1360
    .line 1361
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v0, Ljs5;

    .line 1364
    .line 1365
    check-cast v10, Ljava/lang/Long;

    .line 1366
    .line 1367
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v1, v0, v10}, Lo05;->f(Ljs5;Ljava/lang/Object;)V

    .line 1371
    .line 1372
    .line 1373
    return-object v9

    .line 1374
    :pswitch_b
    move-object v3, v8

    .line 1375
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1376
    .line 1377
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1378
    .line 1379
    .line 1380
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1381
    .line 1382
    check-cast v0, Lea6;

    .line 1383
    .line 1384
    instance-of v2, v1, Ltp0;

    .line 1385
    .line 1386
    if-nez v2, :cond_35

    .line 1387
    .line 1388
    iput-object v1, v0, Lea6;->X:Ljava/lang/Object;

    .line 1389
    .line 1390
    :cond_35
    check-cast v10, Ljp0;

    .line 1391
    .line 1392
    if-eqz v2, :cond_39

    .line 1393
    .line 1394
    instance-of v2, v1, Lsp0;

    .line 1395
    .line 1396
    if-eqz v2, :cond_36

    .line 1397
    .line 1398
    check-cast v1, Lsp0;

    .line 1399
    .line 1400
    goto :goto_27

    .line 1401
    :cond_36
    move-object v1, v3

    .line 1402
    :goto_27
    if-eqz v1, :cond_37

    .line 1403
    .line 1404
    iget-object v8, v1, Lsp0;->a:Ljava/lang/Throwable;

    .line 1405
    .line 1406
    goto :goto_28

    .line 1407
    :cond_37
    move-object v8, v3

    .line 1408
    :goto_28
    if-nez v8, :cond_38

    .line 1409
    .line 1410
    new-instance v1, Lgr0;

    .line 1411
    .line 1412
    invoke-direct {v1}, Lgr0;-><init>()V

    .line 1413
    .line 1414
    .line 1415
    invoke-interface {v10, v1}, Ljp0;->m(Ljava/util/concurrent/CancellationException;)V

    .line 1416
    .line 1417
    .line 1418
    sget-object v1, Ld75;->c:Lz31;

    .line 1419
    .line 1420
    iput-object v1, v0, Lea6;->X:Ljava/lang/Object;

    .line 1421
    .line 1422
    goto :goto_29

    .line 1423
    :cond_38
    throw v8

    .line 1424
    :cond_39
    :goto_29
    return-object v9

    .line 1425
    :pswitch_c
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1426
    .line 1427
    check-cast v1, Lo05;

    .line 1428
    .line 1429
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1430
    .line 1431
    .line 1432
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1433
    .line 1434
    check-cast v0, Lqc2;

    .line 1435
    .line 1436
    iget-object v0, v0, Lqc2;->d:Ljs5;

    .line 1437
    .line 1438
    check-cast v10, Ljava/util/Set;

    .line 1439
    .line 1440
    invoke-virtual {v1, v0, v10}, Lo05;->e(Ljs5;Ljava/lang/Object;)V

    .line 1441
    .line 1442
    .line 1443
    return-object v9

    .line 1444
    :pswitch_d
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1445
    .line 1446
    check-cast v1, Lo05;

    .line 1447
    .line 1448
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1449
    .line 1450
    .line 1451
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1452
    .line 1453
    check-cast v0, Lqc2;

    .line 1454
    .line 1455
    iget-object v0, v0, Lqc2;->b:Ljs5;

    .line 1456
    .line 1457
    invoke-virtual {v1, v0}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v2

    .line 1461
    check-cast v2, Ljava/util/Set;

    .line 1462
    .line 1463
    if-nez v2, :cond_3a

    .line 1464
    .line 1465
    sget-object v2, Lm02;->X:Lm02;

    .line 1466
    .line 1467
    :cond_3a
    sget-object v3, Lvm3;->d:Lum3;

    .line 1468
    .line 1469
    check-cast v10, Lld6;

    .line 1470
    .line 1471
    iget-object v4, v3, Lvm3;->b:Lg55;

    .line 1472
    .line 1473
    sget-object v4, Lld6;->Companion:Ljd6;

    .line 1474
    .line 1475
    invoke-virtual {v4}, Ljd6;->serializer()Low3;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v4

    .line 1479
    check-cast v4, Low3;

    .line 1480
    .line 1481
    invoke-virtual {v3, v4, v10}, Lvm3;->b(Low3;Ljava/lang/Object;)Ljava/lang/String;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v3

    .line 1485
    invoke-static {v2, v3}, Lq57;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v2

    .line 1489
    invoke-virtual {v1, v0, v2}, Lo05;->f(Ljs5;Ljava/lang/Object;)V

    .line 1490
    .line 1491
    .line 1492
    return-object v9

    .line 1493
    :pswitch_e
    move-object v3, v8

    .line 1494
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1495
    .line 1496
    .line 1497
    sget-object v1, Ld69;->a:Lvz7;

    .line 1498
    .line 1499
    iget-object v1, v0, Lco;->i0:Ljava/lang/Object;

    .line 1500
    .line 1501
    check-cast v1, Landroid/content/Context;

    .line 1502
    .line 1503
    iget-object v0, v0, Lco;->h0:Ljava/lang/Object;

    .line 1504
    .line 1505
    check-cast v0, Ljava/lang/String;

    .line 1506
    .line 1507
    check-cast v10, Lnn1;

    .line 1508
    .line 1509
    iget-object v2, v10, Lnn1;->F1:Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;

    .line 1510
    .line 1511
    const-string v4, ""

    .line 1512
    .line 1513
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1517
    .line 1518
    .line 1519
    :try_start_0
    sget-object v5, Lkw4;->a:Lkw4;

    .line 1520
    .line 1521
    invoke-static {v0}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    if-nez v0, :cond_3b

    .line 1526
    .line 1527
    :goto_2a
    move-object v1, v3

    .line 1528
    goto/16 :goto_2f

    .line 1529
    .line 1530
    :cond_3b
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->i()Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v5

    .line 1534
    invoke-static {v5}, Lkw4;->k(Ljava/lang/String;)Ljava/util/Map;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v5

    .line 1538
    new-instance v6, Ljava/util/ArrayList;

    .line 1539
    .line 1540
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 1541
    .line 1542
    .line 1543
    move-result v7

    .line 1544
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1545
    .line 1546
    .line 1547
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v5

    .line 1551
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v5

    .line 1555
    :goto_2b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1556
    .line 1557
    .line 1558
    move-result v7

    .line 1559
    if-eqz v7, :cond_3c

    .line 1560
    .line 1561
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v7

    .line 1565
    check-cast v7, Ljava/util/Map$Entry;

    .line 1566
    .line 1567
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v7

    .line 1571
    check-cast v7, Lsu/happ/proxyutility/dto/ServerConfig;

    .line 1572
    .line 1573
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1574
    .line 1575
    .line 1576
    goto :goto_2b

    .line 1577
    :catchall_0
    move-exception v0

    .line 1578
    goto/16 :goto_2e

    .line 1579
    .line 1580
    :cond_3c
    new-instance v5, Ljava/util/ArrayList;

    .line 1581
    .line 1582
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v6

    .line 1589
    :cond_3d
    :goto_2c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1590
    .line 1591
    .line 1592
    move-result v7

    .line 1593
    if-eqz v7, :cond_3e

    .line 1594
    .line 1595
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v7

    .line 1599
    move-object v8, v7

    .line 1600
    check-cast v8, Lsu/happ/proxyutility/dto/ServerConfig;

    .line 1601
    .line 1602
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ServerConfig;->c()Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v8

    .line 1606
    sget-object v11, Lsu/happ/proxyutility/dto/enums/EConfigType;->CUSTOM:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 1607
    .line 1608
    if-eq v8, v11, :cond_3d

    .line 1609
    .line 1610
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1611
    .line 1612
    .line 1613
    goto :goto_2c

    .line 1614
    :cond_3e
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1615
    .line 1616
    .line 1617
    move-result v6

    .line 1618
    if-eqz v6, :cond_3f

    .line 1619
    .line 1620
    const-string v0, "All configs are invalid or CUSTOM"

    .line 1621
    .line 1622
    invoke-static {v1, v0}, Lx79;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 1623
    .line 1624
    .line 1625
    goto :goto_2a

    .line 1626
    :cond_3f
    const/4 v6, 0x1

    .line 1627
    invoke-static {v1, v6}, Ld69;->q(Landroid/content/Context;Z)Lsu/happ/proxyutility/dto/XRayConfig;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v1

    .line 1631
    if-nez v1, :cond_40

    .line 1632
    .line 1633
    goto :goto_2a

    .line 1634
    :cond_40
    sget-object v6, Le69;->Z:Lf08;

    .line 1635
    .line 1636
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v7

    .line 1640
    const-string v8, "pref_logs_type"

    .line 1641
    .line 1642
    const/4 v11, -0x1

    .line 1643
    invoke-virtual {v7, v11, v8}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 1644
    .line 1645
    .line 1646
    move-result v7

    .line 1647
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1648
    .line 1649
    .line 1650
    invoke-static {v7}, Lf08;->i(I)Le69;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v6

    .line 1654
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v7

    .line 1658
    iget-object v6, v6, Le69;->X:Ljava/lang/String;

    .line 1659
    .line 1660
    invoke-virtual {v7, v6}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->c(Ljava/lang/String;)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v6

    .line 1667
    invoke-virtual {v6, v4}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->a(Ljava/lang/String;)V

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v6

    .line 1674
    invoke-virtual {v6, v4}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->b(Ljava/lang/String;)V

    .line 1675
    .line 1676
    .line 1677
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    invoke-virtual {v1, v0}, Lsu/happ/proxyutility/dto/XRayConfig;->t(Ljava/lang/String;)V

    .line 1682
    .line 1683
    .line 1684
    const/4 v7, 0x0

    .line 1685
    invoke-static {v1, v7}, Ld69;->p(Lsu/happ/proxyutility/dto/XRayConfig;Z)Z

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1693
    .line 1694
    .line 1695
    new-instance v0, Ljava/util/ArrayList;

    .line 1696
    .line 1697
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v4

    .line 1704
    const/4 v6, 0x0

    .line 1705
    :goto_2d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1706
    .line 1707
    .line 1708
    move-result v5

    .line 1709
    if-eqz v5, :cond_42

    .line 1710
    .line 1711
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v5

    .line 1715
    check-cast v5, Lsu/happ/proxyutility/dto/ServerConfig;

    .line 1716
    .line 1717
    const/16 v22, 0x1

    .line 1718
    .line 1719
    add-int/lit8 v6, v6, 0x1

    .line 1720
    .line 1721
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/ServerConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v5

    .line 1725
    if-nez v5, :cond_41

    .line 1726
    .line 1727
    goto :goto_2d

    .line 1728
    :cond_41
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1729
    .line 1730
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1731
    .line 1732
    .line 1733
    const-string v8, "proxy-"

    .line 1734
    .line 1735
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v7

    .line 1745
    invoke-virtual {v5, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->q(Ljava/lang/String;)V

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1749
    .line 1750
    .line 1751
    goto :goto_2d

    .line 1752
    :cond_42
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v4

    .line 1756
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1757
    .line 1758
    .line 1759
    new-instance v4, Ljava/util/ArrayList;

    .line 1760
    .line 1761
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v1, v4}, Lsu/happ/proxyutility/dto/XRayConfig;->r(Ljava/util/ArrayList;)V

    .line 1765
    .line 1766
    .line 1767
    invoke-static {v1}, Ld69;->u(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 1768
    .line 1769
    .line 1770
    invoke-static {v1}, Ld69;->f(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 1771
    .line 1772
    .line 1773
    invoke-static {v1}, Ld69;->e(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 1774
    .line 1775
    .line 1776
    invoke-static {v1, v2}, Ld69;->c(Lsu/happ/proxyutility/dto/XRayConfig;Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;)V

    .line 1777
    .line 1778
    .line 1779
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v0

    .line 1783
    const-string v2, "pref_local_dns_enabled"

    .line 1784
    .line 1785
    invoke-virtual {v0, v2}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 1786
    .line 1787
    .line 1788
    move-result v0

    .line 1789
    if-eqz v0, :cond_43

    .line 1790
    .line 1791
    invoke-static {v1}, Ld69;->d(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 1792
    .line 1793
    .line 1794
    :cond_43
    invoke-static {v1}, Ld69;->t(Lsu/happ/proxyutility/dto/XRayConfig;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1795
    .line 1796
    .line 1797
    goto :goto_2f

    .line 1798
    :goto_2e
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 1799
    .line 1800
    if-nez v1, :cond_46

    .line 1801
    .line 1802
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 1803
    .line 1804
    if-nez v1, :cond_46

    .line 1805
    .line 1806
    new-instance v1, Lrj6;

    .line 1807
    .line 1808
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1809
    .line 1810
    .line 1811
    :goto_2f
    instance-of v0, v1, Lrj6;

    .line 1812
    .line 1813
    if-eqz v0, :cond_44

    .line 1814
    .line 1815
    move-object v8, v3

    .line 1816
    goto :goto_30

    .line 1817
    :cond_44
    move-object v8, v1

    .line 1818
    :goto_30
    check-cast v8, Lsu/happ/proxyutility/dto/XRayConfig;

    .line 1819
    .line 1820
    if-eqz v8, :cond_45

    .line 1821
    .line 1822
    iget-object v0, v10, Lnn1;->G1:Lgn2;

    .line 1823
    .line 1824
    sget-object v1, Lkw4;->a:Lkw4;

    .line 1825
    .line 1826
    invoke-static {}, Lkw4;->g()Lcom/google/gson/a;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v1

    .line 1830
    invoke-virtual {v1, v8}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v1

    .line 1834
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1835
    .line 1836
    .line 1837
    :cond_45
    return-object v9

    .line 1838
    :cond_46
    throw v0

    .line 1839
    :pswitch_f
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1840
    .line 1841
    .line 1842
    iget-object v1, v0, Lco;->h0:Ljava/lang/Object;

    .line 1843
    .line 1844
    check-cast v1, Ljava/lang/String;

    .line 1845
    .line 1846
    const-string v2, "https://time-ntp.com/v1install?id="

    .line 1847
    .line 1848
    invoke-static {v2, v1}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v1

    .line 1852
    sget-object v14, Lun;->Z:Lun;

    .line 1853
    .line 1854
    move-object v11, v10

    .line 1855
    check-cast v11, Lqo;

    .line 1856
    .line 1857
    iget-object v0, v0, Lco;->i0:Ljava/lang/Object;

    .line 1858
    .line 1859
    move-object/from16 v17, v0

    .line 1860
    .line 1861
    check-cast v17, Ljava/lang/String;

    .line 1862
    .line 1863
    const-string v19, "close"

    .line 1864
    .line 1865
    :try_start_1
    sget-object v0, Lss8;->a:Lss8;

    .line 1866
    .line 1867
    iget-object v0, v11, Lqo;->a:Landroid/content/Context;

    .line 1868
    .line 1869
    invoke-static {v0}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    iget-object v2, v0, Lyf8;->X:Ljava/lang/Object;

    .line 1874
    .line 1875
    check-cast v2, Lsu/happ/proxyutility/dto/HWID;

    .line 1876
    .line 1877
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v13

    .line 1881
    iget-object v2, v0, Lyf8;->Y:Ljava/lang/Object;

    .line 1882
    .line 1883
    check-cast v2, Lsu/happ/proxyutility/dto/VersionOS;

    .line 1884
    .line 1885
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v15

    .line 1889
    iget-object v0, v0, Lyf8;->Z:Ljava/lang/Object;

    .line 1890
    .line 1891
    check-cast v0, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 1892
    .line 1893
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v16

    .line 1897
    const/16 v0, 0x2328

    .line 1898
    .line 1899
    const/4 v6, 0x1

    .line 1900
    const/4 v7, 0x0

    .line 1901
    invoke-virtual {v11, v0, v6, v7}, Lqo;->b(IZZ)Lokhttp3/OkHttpClient;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v0

    .line 1905
    new-instance v12, Ljava/net/URL;

    .line 1906
    .line 1907
    invoke-direct {v12, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 1908
    .line 1909
    .line 1910
    const/16 v18, 0x0

    .line 1911
    .line 1912
    const/16 v20, 0x0

    .line 1913
    .line 1914
    invoke-virtual/range {v11 .. v20}, Lqo;->a(Ljava/net/URL;Ljava/lang/String;Lun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lokhttp3/Request$Builder;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v1

    .line 1918
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v1

    .line 1922
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v0

    .line 1926
    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v0

    .line 1930
    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v1

    .line 1934
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v1

    .line 1938
    invoke-static {}, Lss8;->t()Z

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    .line 1942
    .line 1943
    .line 1944
    move-result v0

    .line 1945
    new-instance v2, Ljava/lang/Integer;

    .line 1946
    .line 1947
    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 1948
    .line 1949
    .line 1950
    sget-object v0, Lyw2;->b:Lcom/google/gson/a;

    .line 1951
    .line 1952
    const-class v3, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 1953
    .line 1954
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1955
    .line 1956
    .line 1957
    new-instance v4, Lyi8;

    .line 1958
    .line 1959
    invoke-direct {v4, v3}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 1960
    .line 1961
    .line 1962
    invoke-virtual {v0, v1, v4}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v0

    .line 1966
    if-eqz v0, :cond_47

    .line 1967
    .line 1968
    new-instance v1, Lqg5;

    .line 1969
    .line 1970
    invoke-direct {v1, v2, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1971
    .line 1972
    .line 1973
    goto :goto_31

    .line 1974
    :cond_47
    const-string v0, "Required value was null."

    .line 1975
    .line 1976
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1977
    .line 1978
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1979
    .line 1980
    .line 1981
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1982
    :catchall_1
    move-exception v0

    .line 1983
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 1984
    .line 1985
    if-nez v1, :cond_48

    .line 1986
    .line 1987
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 1988
    .line 1989
    if-nez v1, :cond_48

    .line 1990
    .line 1991
    new-instance v1, Lrj6;

    .line 1992
    .line 1993
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1994
    .line 1995
    .line 1996
    :goto_31
    new-instance v0, Lsj6;

    .line 1997
    .line 1998
    invoke-direct {v0, v1}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 1999
    .line 2000
    .line 2001
    return-object v0

    .line 2002
    :cond_48
    throw v0

    .line 2003
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
