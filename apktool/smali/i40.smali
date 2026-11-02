.class public final synthetic Li40;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:I

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 20
    iput-byte p6, p0, Li40;->X:B

    iput-object p1, p0, Li40;->f0:Ljava/lang/Object;

    iput-object p2, p0, Li40;->Y:Ljava/lang/Object;

    iput-object p3, p0, Li40;->g0:Ljava/lang/Object;

    iput-object p4, p0, Li40;->h0:Ljava/lang/Object;

    iput p5, p0, Li40;->Z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lnr5;Lzy0;Ljc8;Lzy0;I)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput-byte v0, p0, Li40;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li40;->f0:Ljava/lang/Object;

    iput-object p2, p0, Li40;->Y:Ljava/lang/Object;

    iput-object p3, p0, Li40;->h0:Ljava/lang/Object;

    iput-object p4, p0, Li40;->g0:Ljava/lang/Object;

    iput p5, p0, Li40;->Z:I

    return-void
.end method

.method public synthetic constructor <init>(Lsq6;Ldn2;Lgn2;Lo87;I)V
    .locals 1

    .line 19
    const/4 v0, 0x4

    iput-byte v0, p0, Li40;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li40;->f0:Ljava/lang/Object;

    iput-object p2, p0, Li40;->Y:Ljava/lang/Object;

    iput-object p3, p0, Li40;->g0:Ljava/lang/Object;

    iput-object p4, p0, Li40;->h0:Ljava/lang/Object;

    iput p5, p0, Li40;->Z:I

    return-void
.end method

.method public synthetic constructor <init>(Lzy0;Lh30;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Li40;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Li40;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Li40;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Li40;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Li40;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    iput p5, p0, Li40;->Z:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Li40;->X:B

    .line 4
    .line 5
    iget-object v2, v0, Li40;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Li40;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Li40;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v5, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    iget v6, v0, Li40;->Z:I

    .line 14
    .line 15
    iget-object v7, v0, Li40;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v8, v7

    .line 21
    check-cast v8, Lsq6;

    .line 22
    .line 23
    move-object v9, v4

    .line 24
    check-cast v9, Ldn2;

    .line 25
    .line 26
    move-object v10, v3

    .line 27
    check-cast v10, Lgn2;

    .line 28
    .line 29
    move-object v11, v2

    .line 30
    check-cast v11, Lo87;

    .line 31
    .line 32
    move-object/from16 v12, p1

    .line 33
    .line 34
    check-cast v12, Llp2;

    .line 35
    .line 36
    move-object/from16 v0, p2

    .line 37
    .line 38
    check-cast v0, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    or-int/lit8 v0, v6, 0x1

    .line 44
    .line 45
    invoke-static {v0}, Lw79;->P(I)I

    .line 46
    .line 47
    .line 48
    move-result v13

    .line 49
    invoke-static/range {v8 .. v13}, Lch3;->e(Lsq6;Ldn2;Lgn2;Lo87;Llp2;I)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :pswitch_0
    move-object v14, v7

    .line 54
    check-cast v14, Ljava/lang/Boolean;

    .line 55
    .line 56
    move-object/from16 v16, v3

    .line 57
    .line 58
    check-cast v16, Ld94;

    .line 59
    .line 60
    move-object/from16 v17, v2

    .line 61
    .line 62
    check-cast v17, Lgn2;

    .line 63
    .line 64
    move-object/from16 v18, p1

    .line 65
    .line 66
    check-cast v18, Llp2;

    .line 67
    .line 68
    move-object/from16 v1, p2

    .line 69
    .line 70
    check-cast v1, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    or-int/lit8 v1, v6, 0x1

    .line 76
    .line 77
    invoke-static {v1}, Lw79;->P(I)I

    .line 78
    .line 79
    .line 80
    move-result v19

    .line 81
    iget-object v15, v0, Li40;->Y:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static/range {v14 .. v19}, Lyn0;->j(Ljava/lang/Boolean;Ljava/lang/Object;Ld94;Lgn2;Llp2;I)V

    .line 84
    .line 85
    .line 86
    return-object v5

    .line 87
    :pswitch_1
    check-cast v7, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 88
    .line 89
    check-cast v4, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;

    .line 90
    .line 91
    move-object v8, v3

    .line 92
    check-cast v8, Lgn2;

    .line 93
    .line 94
    move-object v9, v2

    .line 95
    check-cast v9, Lkx4;

    .line 96
    .line 97
    move-object/from16 v10, p1

    .line 98
    .line 99
    check-cast v10, Llp2;

    .line 100
    .line 101
    move-object/from16 v0, p2

    .line 102
    .line 103
    check-cast v0, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    or-int/lit8 v0, v6, 0x1

    .line 109
    .line 110
    invoke-static {v0}, Lw79;->P(I)I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    move-object v6, v7

    .line 115
    move-object v7, v4

    .line 116
    invoke-static/range {v6 .. v11}, Lgr2;->a(Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;Lgn2;Lkx4;Llp2;I)V

    .line 117
    .line 118
    .line 119
    return-object v5

    .line 120
    :pswitch_2
    move-object v12, v4

    .line 121
    check-cast v12, Lzy0;

    .line 122
    .line 123
    move-object v13, v7

    .line 124
    check-cast v13, Lh30;

    .line 125
    .line 126
    move-object/from16 v16, p1

    .line 127
    .line 128
    check-cast v16, Llp2;

    .line 129
    .line 130
    move-object/from16 v1, p2

    .line 131
    .line 132
    check-cast v1, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-static {v6}, Lw79;->P(I)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    or-int/lit8 v17, v1, 0x1

    .line 142
    .line 143
    iget-object v14, v0, Li40;->g0:Ljava/lang/Object;

    .line 144
    .line 145
    iget-object v15, v0, Li40;->h0:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v17}, Lzy0;->e(Lh30;Ljava/lang/Object;Ljava/lang/Object;Llp2;I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    return-object v5

    .line 151
    :pswitch_3
    check-cast v7, Lnr5;

    .line 152
    .line 153
    check-cast v4, Lzy0;

    .line 154
    .line 155
    move-object v8, v2

    .line 156
    check-cast v8, Ljc8;

    .line 157
    .line 158
    move-object v9, v3

    .line 159
    check-cast v9, Lzy0;

    .line 160
    .line 161
    move-object/from16 v10, p1

    .line 162
    .line 163
    check-cast v10, Llp2;

    .line 164
    .line 165
    move-object/from16 v0, p2

    .line 166
    .line 167
    check-cast v0, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    or-int/lit8 v0, v6, 0x1

    .line 173
    .line 174
    invoke-static {v0}, Lw79;->P(I)I

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    move-object v6, v7

    .line 179
    move-object v7, v4

    .line 180
    invoke-static/range {v6 .. v11}, Lz68;->c(Lnr5;Lzy0;Ljc8;Lzy0;Llp2;I)V

    .line 181
    .line 182
    .line 183
    return-object v5

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
