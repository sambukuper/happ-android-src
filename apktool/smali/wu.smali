.class public final synthetic Lwu;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfv;Ljava/lang/String;Lkx4;Lgn2;Lq8;Lz41;II)V
    .locals 0

    .line 1
    const/4 p7, 0x0

    .line 2
    iput-byte p7, p0, Lwu;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwu;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwu;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwu;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwu;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwu;->i0:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lwu;->j0:Ljava/lang/Object;

    .line 18
    .line 19
    iput p8, p0, Lwu;->Y:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Llg4;Lgn2;Lj74;Lgg5;Loh2;Lkx4;I)V
    .locals 1

    .line 23
    const/4 v0, 0x2

    iput-byte v0, p0, Lwu;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwu;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lwu;->h0:Ljava/lang/Object;

    iput-object p3, p0, Lwu;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lwu;->i0:Ljava/lang/Object;

    iput-object p5, p0, Lwu;->j0:Ljava/lang/Object;

    iput-object p6, p0, Lwu;->g0:Ljava/lang/Object;

    iput p7, p0, Lwu;->Y:I

    return-void
.end method

.method public synthetic constructor <init>(Lwb7;Lkx4;Ljb7;Lxz4;Lzy0;Lsn2;I)V
    .locals 1

    .line 24
    const/4 v0, 0x3

    iput-byte v0, p0, Lwu;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwu;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lwu;->g0:Ljava/lang/Object;

    iput-object p3, p0, Lwu;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lwu;->h0:Ljava/lang/Object;

    iput-object p5, p0, Lwu;->i0:Ljava/lang/Object;

    iput-object p6, p0, Lwu;->j0:Ljava/lang/Object;

    iput p7, p0, Lwu;->Y:I

    return-void
.end method

.method public synthetic constructor <init>(Lzy0;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 22
    const/4 v0, 0x1

    iput-byte v0, p0, Lwu;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwu;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lwu;->f0:Ljava/lang/Object;

    iput-object p3, p0, Lwu;->g0:Ljava/lang/Object;

    iput-object p4, p0, Lwu;->h0:Ljava/lang/Object;

    iput-object p5, p0, Lwu;->i0:Ljava/lang/Object;

    iput-object p6, p0, Lwu;->j0:Ljava/lang/Object;

    iput p7, p0, Lwu;->Y:I

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lwu;->X:B

    .line 4
    .line 5
    iget-object v2, v0, Lwu;->j0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Lwu;->i0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lwu;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lwu;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v6, Ldn8;->a:Ldn8;

    .line 14
    .line 15
    iget v7, v0, Lwu;->Y:I

    .line 16
    .line 17
    iget-object v8, v0, Lwu;->g0:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v9, v0, Lwu;->Z:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object v10, v9

    .line 25
    check-cast v10, Lwb7;

    .line 26
    .line 27
    move-object v11, v8

    .line 28
    check-cast v11, Lkx4;

    .line 29
    .line 30
    move-object v12, v5

    .line 31
    check-cast v12, Ljb7;

    .line 32
    .line 33
    move-object v13, v4

    .line 34
    check-cast v13, Lxz4;

    .line 35
    .line 36
    move-object v14, v3

    .line 37
    check-cast v14, Lzy0;

    .line 38
    .line 39
    move-object v15, v2

    .line 40
    check-cast v15, Lsn2;

    .line 41
    .line 42
    move-object/from16 v16, p1

    .line 43
    .line 44
    check-cast v16, Llp2;

    .line 45
    .line 46
    move-object/from16 v0, p2

    .line 47
    .line 48
    check-cast v0, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    or-int/lit8 v0, v7, 0x1

    .line 54
    .line 55
    invoke-static {v0}, Lw79;->P(I)I

    .line 56
    .line 57
    .line 58
    move-result v17

    .line 59
    invoke-static/range {v10 .. v17}, Lvb7;->b(Lwb7;Lkx4;Ljb7;Lxz4;Lzy0;Lsn2;Llp2;I)V

    .line 60
    .line 61
    .line 62
    return-object v6

    .line 63
    :pswitch_0
    move-object/from16 v18, v9

    .line 64
    .line 65
    check-cast v18, Llg4;

    .line 66
    .line 67
    move-object/from16 v19, v4

    .line 68
    .line 69
    check-cast v19, Lgn2;

    .line 70
    .line 71
    move-object/from16 v20, v5

    .line 72
    .line 73
    check-cast v20, Lj74;

    .line 74
    .line 75
    move-object/from16 v21, v3

    .line 76
    .line 77
    check-cast v21, Lgg5;

    .line 78
    .line 79
    move-object/from16 v22, v2

    .line 80
    .line 81
    check-cast v22, Loh2;

    .line 82
    .line 83
    move-object/from16 v23, v8

    .line 84
    .line 85
    check-cast v23, Lkx4;

    .line 86
    .line 87
    move-object/from16 v24, p1

    .line 88
    .line 89
    check-cast v24, Llp2;

    .line 90
    .line 91
    move-object/from16 v0, p2

    .line 92
    .line 93
    check-cast v0, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    or-int/lit8 v0, v7, 0x1

    .line 99
    .line 100
    invoke-static {v0}, Lw79;->P(I)I

    .line 101
    .line 102
    .line 103
    move-result v25

    .line 104
    invoke-static/range {v18 .. v25}, Lwl7;->e(Llg4;Lgn2;Lj74;Lgg5;Loh2;Lkx4;Llp2;I)V

    .line 105
    .line 106
    .line 107
    return-object v6

    .line 108
    :pswitch_1
    check-cast v9, Lzy0;

    .line 109
    .line 110
    check-cast v8, Ljava/lang/Boolean;

    .line 111
    .line 112
    move-object/from16 v13, p1

    .line 113
    .line 114
    check-cast v13, Llp2;

    .line 115
    .line 116
    move-object/from16 v1, p2

    .line 117
    .line 118
    check-cast v1, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v7}, Lw79;->P(I)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    or-int/lit8 v14, v1, 0x1

    .line 128
    .line 129
    move-object v7, v9

    .line 130
    move-object v9, v8

    .line 131
    iget-object v8, v0, Lwu;->f0:Ljava/lang/Object;

    .line 132
    .line 133
    iget-object v10, v0, Lwu;->h0:Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v11, v0, Lwu;->i0:Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v12, v0, Lwu;->j0:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual/range {v7 .. v14}, Lzy0;->g(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Llp2;I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    return-object v6

    .line 143
    :pswitch_2
    move-object v15, v9

    .line 144
    check-cast v15, Lfv;

    .line 145
    .line 146
    move-object/from16 v16, v5

    .line 147
    .line 148
    check-cast v16, Ljava/lang/String;

    .line 149
    .line 150
    move-object/from16 v17, v8

    .line 151
    .line 152
    check-cast v17, Lkx4;

    .line 153
    .line 154
    move-object/from16 v18, v4

    .line 155
    .line 156
    check-cast v18, Lgn2;

    .line 157
    .line 158
    move-object/from16 v19, v3

    .line 159
    .line 160
    check-cast v19, Lq8;

    .line 161
    .line 162
    move-object/from16 v20, v2

    .line 163
    .line 164
    check-cast v20, Lz41;

    .line 165
    .line 166
    move-object/from16 v21, p1

    .line 167
    .line 168
    check-cast v21, Llp2;

    .line 169
    .line 170
    move-object/from16 v0, p2

    .line 171
    .line 172
    check-cast v0, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const/16 v0, 0x181

    .line 178
    .line 179
    invoke-static {v0}, Lw79;->P(I)I

    .line 180
    .line 181
    .line 182
    move-result v22

    .line 183
    invoke-static {v7}, Lw79;->P(I)I

    .line 184
    .line 185
    .line 186
    move-result v23

    .line 187
    invoke-static/range {v15 .. v23}, Lkm4;->a(Lfv;Ljava/lang/String;Lkx4;Lgn2;Lq8;Lz41;Llp2;II)V

    .line 188
    .line 189
    .line 190
    return-object v6

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
