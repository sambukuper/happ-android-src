.class public final synthetic Lxn1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Leo1;


# direct methods
.method public synthetic constructor <init>(Leo1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lxn1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lxn1;->Y:Leo1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lxn1;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, Lxn1;->Y:Leo1;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v4, v4}, Lsn1;->R(ZZ)V

    .line 15
    .line 16
    .line 17
    return-object v3

    .line 18
    :pswitch_0
    invoke-virtual {v0, v4, v4}, Lsn1;->R(ZZ)V

    .line 19
    .line 20
    .line 21
    return-object v3

    .line 22
    :pswitch_1
    invoke-virtual {v0, v4, v4}, Lsn1;->R(ZZ)V

    .line 23
    .line 24
    .line 25
    return-object v3

    .line 26
    :pswitch_2
    invoke-static {v0}, Li21;->H(Ld94;)Lu84;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v4, Lzn1;

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    invoke-direct {v4, v0, v2, v5}, Lzn1;-><init>(Leo1;Lq51;B)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-static {v1, v2, v4, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 38
    .line 39
    .line 40
    return-object v3

    .line 41
    :pswitch_3
    invoke-virtual {v0, v4, v4}, Lsn1;->R(ZZ)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :pswitch_4
    iget-object v1, v0, Leo1;->u1:Lvz7;

    .line 46
    .line 47
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v3, v1

    .line 52
    check-cast v3, Lmh7;

    .line 53
    .line 54
    new-instance v4, Ld0;

    .line 55
    .line 56
    invoke-virtual {v0}, Leo1;->Z()Ll27;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const/4 v10, 0x0

    .line 61
    const/16 v11, 0x9

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    const-class v15, Ll27;

    .line 65
    .line 66
    const-string v8, "onChangedExpanded"

    .line 67
    .line 68
    const-string v9, "onChangedExpanded-PzuDCJM(Ljava/lang/String;)V"

    .line 69
    .line 70
    move-object v7, v15

    .line 71
    invoke-direct/range {v4 .. v11}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    new-instance v5, Lyn1;

    .line 75
    .line 76
    invoke-virtual {v0}, Leo1;->Z()Ll27;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    const/16 v19, 0x0

    .line 83
    .line 84
    const/4 v13, 0x2

    .line 85
    const-string v16, "onSubChecked"

    .line 86
    .line 87
    const-string v17, "onSubChecked-N_SCOKg(Ljava/lang/String;Z)V"

    .line 88
    .line 89
    move-object v12, v5

    .line 90
    invoke-direct/range {v12 .. v19}, Lyn1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 91
    .line 92
    .line 93
    new-instance v6, Lvb;

    .line 94
    .line 95
    invoke-virtual {v0}, Leo1;->Z()Ll27;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    const/16 v19, 0x6

    .line 100
    .line 101
    const/4 v13, 0x3

    .line 102
    const-string v16, "onServerChecked"

    .line 103
    .line 104
    const-string v17, "onServerChecked-S0IonpA(Ljava/lang/String;Ljava/lang/String;Z)V"

    .line 105
    .line 106
    move-object v12, v6

    .line 107
    invoke-direct/range {v12 .. v19}, Lvb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 108
    .line 109
    .line 110
    new-instance v2, Ldw7;

    .line 111
    .line 112
    const/4 v9, 0x0

    .line 113
    const/16 v10, 0xa4

    .line 114
    .line 115
    move-object v8, v4

    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    invoke-direct/range {v2 .. v10}, Ldw7;-><init>(Lmh7;Lyn1;Lyn1;Lvb;Luj4;Lgn2;Lsb;I)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :pswitch_5
    invoke-virtual {v0}, Leo1;->Z()Ll27;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-object v1, v1, Ll27;->f:Lh76;

    .line 127
    .line 128
    new-instance v2, Lco1;

    .line 129
    .line 130
    invoke-direct {v2, v1, v4}, Lco1;-><init>(Lh76;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {v2}, Lw51;->t(Lxe2;)Lxe2;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v0, v0, Lqk2;->S0:Lg94;

    .line 138
    .line 139
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sget-object v2, Lh87;->a:Lg55;

    .line 144
    .line 145
    sget-object v3, Lkm5;->f0:Lkm5;

    .line 146
    .line 147
    invoke-static {v1, v0, v2, v3}, Ljm4;->a0(Lxe2;Lb71;Li87;Ljava/lang/Object;)Lh76;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0

    .line 152
    :pswitch_6
    new-instance v1, Lf27;

    .line 153
    .line 154
    invoke-virtual {v0}, Lqk2;->M()Landroidx/fragment/app/FragmentActivity;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v4, Lcom/google/gson/a;

    .line 166
    .line 167
    invoke-direct {v4}, Lcom/google/gson/a;-><init>()V

    .line 168
    .line 169
    .line 170
    iget-object v0, v0, Lqk2;->h0:Landroid/os/Bundle;

    .line 171
    .line 172
    if-eqz v0, :cond_0

    .line 173
    .line 174
    const-string v5, "socket_server_info"

    .line 175
    .line 176
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    goto :goto_0

    .line 181
    :cond_0
    move-object v0, v2

    .line 182
    :goto_0
    if-eqz v0, :cond_1

    .line 183
    .line 184
    new-instance v2, Lyi8;

    .line 185
    .line 186
    const-class v5, Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 187
    .line 188
    invoke-direct {v2, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4, v0, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    check-cast v0, Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 199
    .line 200
    invoke-direct {v1, v3, v0}, Lf27;-><init>(Landroid/app/Application;Lsu/happ/proxyutility/dto/SocketServerInfo;)V

    .line 201
    .line 202
    .line 203
    move-object v2, v1

    .line 204
    goto :goto_1

    .line 205
    :cond_1
    const-string v0, "Required value was null."

    .line 206
    .line 207
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    :goto_1
    return-object v2

    .line 211
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
