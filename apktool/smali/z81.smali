.class public final Lz81;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Z

.field public final synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgh1;Lq51;ZLjava/util/LinkedHashSet;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lz81;->g0:B

    .line 16
    iput-object p1, p0, Lz81;->j0:Ljava/lang/Object;

    iput-boolean p3, p0, Lz81;->i0:Z

    iput-object p4, p0, Lz81;->k0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lq51;Lgn2;Lql6;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lz81;->g0:B

    .line 17
    iput-object p3, p0, Lz81;->j0:Ljava/lang/Object;

    iput-boolean p4, p0, Lz81;->i0:Z

    iput-object p2, p0, Lz81;->k0:Ljava/lang/Object;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/Object;ZLq51;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, Lz81;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lz81;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lz81;->h0:Z

    .line 6
    .line 7
    iput-object p3, p0, Lz81;->k0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p4, p0, Lz81;->i0:Z

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(ZLla;Ljava/lang/Object;Lq51;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lz81;->g0:B

    .line 18
    iput-boolean p1, p0, Lz81;->i0:Z

    iput-object p2, p0, Lz81;->j0:Ljava/lang/Object;

    iput-object p3, p0, Lz81;->k0:Ljava/lang/Object;

    invoke-direct {p0, v0, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lz81;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lz81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lz81;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lz81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lz81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lz81;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lz81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lz81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lz81;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lz81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    invoke-virtual {p0, p2, p1}, Lz81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lz81;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lz81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_3
    invoke-virtual {p0, p2, p1}, Lz81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lz81;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lz81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 11

    .line 1
    iget-byte p2, p0, Lz81;->g0:B

    .line 2
    .line 3
    iget-boolean v0, p0, Lz81;->i0:Z

    .line 4
    .line 5
    iget-object v1, p0, Lz81;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, Lz81;->j0:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v3, Lz81;

    .line 13
    .line 14
    move-object v4, v2

    .line 15
    check-cast v4, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 16
    .line 17
    iget-boolean v5, p0, Lz81;->h0:Z

    .line 18
    .line 19
    move-object v6, v1

    .line 20
    check-cast v6, Lsu/happ/proxyutility/dto/ImportResult;

    .line 21
    .line 22
    iget-boolean v7, p0, Lz81;->i0:Z

    .line 23
    .line 24
    const/4 v9, 0x4

    .line 25
    move-object v8, p1

    .line 26
    invoke-direct/range {v3 .. v9}, Lz81;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/Object;ZLq51;B)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    move-object v8, p1

    .line 31
    new-instance v4, Lz81;

    .line 32
    .line 33
    move-object v5, v2

    .line 34
    check-cast v5, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 35
    .line 36
    iget-boolean v6, p0, Lz81;->h0:Z

    .line 37
    .line 38
    move-object v7, v1

    .line 39
    check-cast v7, Lt83;

    .line 40
    .line 41
    iget-boolean p0, p0, Lz81;->i0:Z

    .line 42
    .line 43
    const/4 v10, 0x3

    .line 44
    move-object v9, v8

    .line 45
    move v8, p0

    .line 46
    invoke-direct/range {v4 .. v10}, Lz81;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/Object;ZLq51;B)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :pswitch_1
    move-object v8, p1

    .line 51
    new-instance p0, Lz81;

    .line 52
    .line 53
    check-cast v2, Lla;

    .line 54
    .line 55
    invoke-direct {p0, v0, v2, v1, v8}, Lz81;-><init>(ZLla;Ljava/lang/Object;Lq51;)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_2
    move-object v8, p1

    .line 60
    new-instance p0, Lz81;

    .line 61
    .line 62
    check-cast v2, Lgh1;

    .line 63
    .line 64
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-direct {p0, v2, v8, v0, v1}, Lz81;-><init>(Lgh1;Lq51;ZLjava/util/LinkedHashSet;)V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_3
    move-object v8, p1

    .line 71
    new-instance p0, Lz81;

    .line 72
    .line 73
    check-cast v2, Lql6;

    .line 74
    .line 75
    check-cast v1, Lgn2;

    .line 76
    .line 77
    invoke-direct {p0, v8, v1, v2, v0}, Lz81;-><init>(Lq51;Lgn2;Lql6;Z)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lz81;->g0:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Lc71;->X:Lc71;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    sget-object v4, Ldn8;->a:Ldn8;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-boolean v6, p0, Lz81;->i0:Z

    .line 12
    .line 13
    iget-object v7, p0, Lz81;->k0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, p0, Lz81;->j0:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lko1;->B1:Lm51;

    .line 24
    .line 25
    check-cast v8, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 26
    .line 27
    invoke-virtual {v8}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lkm4;->x(Lml2;)V

    .line 32
    .line 33
    .line 34
    iget-boolean p0, p0, Lz81;->h0:Z

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    check-cast v7, Lsu/happ/proxyutility/dto/ImportResult;

    .line 39
    .line 40
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v8, p0, v6}, Lsu/happ/proxyutility/feature/main/MainActivity;->J(Lt83;Z)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object v4

    .line 48
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lko1;->B1:Lm51;

    .line 52
    .line 53
    check-cast v8, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 54
    .line 55
    invoke-virtual {v8}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lkm4;->x(Lml2;)V

    .line 60
    .line 61
    .line 62
    iget-boolean p0, p0, Lz81;->h0:Z

    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    check-cast v7, Lt83;

    .line 67
    .line 68
    invoke-virtual {v8, v7, v6}, Lsu/happ/proxyutility/feature/main/MainActivity;->J(Lt83;Z)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-object v4

    .line 72
    :pswitch_1
    iget-boolean v0, p0, Lz81;->h0:Z

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    if-ne v0, v3, :cond_2

    .line 77
    .line 78
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v2, v5

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    if-nez v6, :cond_4

    .line 91
    .line 92
    check-cast v8, Lla;

    .line 93
    .line 94
    iput-boolean v3, p0, Lz81;->h0:Z

    .line 95
    .line 96
    invoke-static {v8, v7, p0}, Lt9;->a(Lla;Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, v2, :cond_4

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    :goto_0
    move-object v2, v4

    .line 104
    :goto_1
    return-object v2

    .line 105
    :pswitch_2
    iget-boolean v0, p0, Lz81;->h0:Z

    .line 106
    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    if-ne v0, v3, :cond_5

    .line 110
    .line 111
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    move-object p1, v5

    .line 119
    goto :goto_2

    .line 120
    :cond_6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    check-cast v8, Lgh1;

    .line 124
    .line 125
    invoke-virtual {v8}, Lgh1;->j()Lwq8;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast v7, Ljava/util/LinkedHashSet;

    .line 130
    .line 131
    invoke-virtual {p1, v7, v6}, Lwq8;->f(Ljava/util/LinkedHashSet;Z)Lxg1;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-boolean v3, p0, Lz81;->h0:Z

    .line 136
    .line 137
    check-cast p1, Lux0;

    .line 138
    .line 139
    invoke-virtual {p1, p0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p1, v2, :cond_7

    .line 144
    .line 145
    move-object p1, v2

    .line 146
    :cond_7
    :goto_2
    return-object p1

    .line 147
    :pswitch_3
    iget-boolean v0, p0, Lz81;->h0:Z

    .line 148
    .line 149
    if-eqz v0, :cond_9

    .line 150
    .line 151
    if-ne v0, v3, :cond_8

    .line 152
    .line 153
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    move-object p1, v5

    .line 161
    goto :goto_3

    .line 162
    :cond_9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    check-cast v8, Lql6;

    .line 166
    .line 167
    new-instance p1, Lb91;

    .line 168
    .line 169
    check-cast v7, Lgn2;

    .line 170
    .line 171
    invoke-direct {p1, v5, v7, v8, v6}, Lb91;-><init>(Lq51;Lgn2;Lql6;Z)V

    .line 172
    .line 173
    .line 174
    iput-boolean v3, p0, Lz81;->h0:Z

    .line 175
    .line 176
    invoke-virtual {v8, v6, p1, p0}, Lql6;->q(ZLrn2;Ls51;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-ne p1, v2, :cond_a

    .line 181
    .line 182
    move-object p1, v2

    .line 183
    :cond_a
    :goto_3
    return-object p1

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
