.class public final synthetic Lj40;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:I

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Lon2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLh51;Lkx4;Lsn2;Ldn2;I)V
    .locals 1

    .line 23
    const/4 v0, 0x1

    iput-byte v0, p0, Lj40;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj40;->f0:Ljava/lang/Object;

    iput-boolean p2, p0, Lj40;->Y:Z

    iput-object p3, p0, Lj40;->g0:Ljava/lang/Object;

    iput-object p4, p0, Lj40;->h0:Ljava/lang/Object;

    iput-object p5, p0, Lj40;->i0:Ljava/lang/Object;

    iput-object p6, p0, Lj40;->j0:Lon2;

    iput p7, p0, Lj40;->Z:I

    return-void
.end method

.method public synthetic constructor <init>(Lnr5;Ljc8;Lb71;ZLy05;Lzy0;I)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput-byte v0, p0, Lj40;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj40;->f0:Ljava/lang/Object;

    iput-object p2, p0, Lj40;->g0:Ljava/lang/Object;

    iput-object p3, p0, Lj40;->h0:Ljava/lang/Object;

    iput-boolean p4, p0, Lj40;->Y:Z

    iput-object p5, p0, Lj40;->i0:Ljava/lang/Object;

    iput-object p6, p0, Lj40;->j0:Lon2;

    iput p7, p0, Lj40;->Z:I

    return-void
.end method

.method public synthetic constructor <init>(Lnr5;Lzy0;Ljc8;Lkx4;ZLzy0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lj40;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lj40;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lj40;->j0:Lon2;

    .line 10
    .line 11
    iput-object p3, p0, Lj40;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lj40;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lj40;->Y:Z

    .line 16
    .line 17
    iput-object p6, p0, Lj40;->i0:Ljava/lang/Object;

    .line 18
    .line 19
    iput p7, p0, Lj40;->Z:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lj40;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Lj40;->Z:I

    .line 8
    .line 9
    iget-object v4, v0, Lj40;->i0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lj40;->h0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lj40;->g0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lj40;->j0:Lon2;

    .line 16
    .line 17
    iget-object v8, v0, Lj40;->f0:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v9, v8

    .line 23
    check-cast v9, Lnr5;

    .line 24
    .line 25
    move-object v10, v7

    .line 26
    check-cast v10, Lzy0;

    .line 27
    .line 28
    move-object v11, v6

    .line 29
    check-cast v11, Ljc8;

    .line 30
    .line 31
    move-object v12, v5

    .line 32
    check-cast v12, Lkx4;

    .line 33
    .line 34
    move-object v14, v4

    .line 35
    check-cast v14, Lzy0;

    .line 36
    .line 37
    move-object/from16 v15, p1

    .line 38
    .line 39
    check-cast v15, Llp2;

    .line 40
    .line 41
    move-object/from16 v1, p2

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    or-int/lit8 v1, v3, 0x1

    .line 49
    .line 50
    invoke-static {v1}, Lw79;->P(I)I

    .line 51
    .line 52
    .line 53
    move-result v16

    .line 54
    iget-boolean v13, v0, Lj40;->Y:Z

    .line 55
    .line 56
    invoke-static/range {v9 .. v16}, Lec8;->c(Lnr5;Lzy0;Ljc8;Lkx4;ZLzy0;Llp2;I)V

    .line 57
    .line 58
    .line 59
    return-object v2

    .line 60
    :pswitch_0
    move-object/from16 v17, v8

    .line 61
    .line 62
    check-cast v17, Ljava/lang/String;

    .line 63
    .line 64
    move-object/from16 v19, v6

    .line 65
    .line 66
    check-cast v19, Lh51;

    .line 67
    .line 68
    move-object/from16 v20, v5

    .line 69
    .line 70
    check-cast v20, Lkx4;

    .line 71
    .line 72
    move-object/from16 v21, v4

    .line 73
    .line 74
    check-cast v21, Lsn2;

    .line 75
    .line 76
    move-object/from16 v22, v7

    .line 77
    .line 78
    check-cast v22, Ldn2;

    .line 79
    .line 80
    move-object/from16 v23, p1

    .line 81
    .line 82
    check-cast v23, Llp2;

    .line 83
    .line 84
    move-object/from16 v1, p2

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    or-int/lit8 v1, v3, 0x1

    .line 92
    .line 93
    invoke-static {v1}, Lw79;->P(I)I

    .line 94
    .line 95
    .line 96
    move-result v24

    .line 97
    iget-boolean v0, v0, Lj40;->Y:Z

    .line 98
    .line 99
    move/from16 v18, v0

    .line 100
    .line 101
    invoke-static/range {v17 .. v24}, Ll51;->c(Ljava/lang/String;ZLh51;Lkx4;Lsn2;Ldn2;Llp2;I)V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :pswitch_1
    check-cast v8, Lnr5;

    .line 106
    .line 107
    check-cast v6, Ljc8;

    .line 108
    .line 109
    check-cast v5, Lb71;

    .line 110
    .line 111
    check-cast v4, Ly05;

    .line 112
    .line 113
    check-cast v7, Lzy0;

    .line 114
    .line 115
    move-object/from16 v9, p1

    .line 116
    .line 117
    check-cast v9, Llp2;

    .line 118
    .line 119
    move-object/from16 v1, p2

    .line 120
    .line 121
    check-cast v1, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    or-int/lit8 v1, v3, 0x1

    .line 127
    .line 128
    invoke-static {v1}, Lw79;->P(I)I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    iget-boolean v0, v0, Lj40;->Y:Z

    .line 133
    .line 134
    move-object v3, v8

    .line 135
    move-object v8, v7

    .line 136
    move-object v7, v4

    .line 137
    move-object v4, v6

    .line 138
    move v6, v0

    .line 139
    invoke-static/range {v3 .. v10}, Lz68;->g(Lnr5;Ljc8;Lb71;ZLy05;Lzy0;Llp2;I)V

    .line 140
    .line 141
    .line 142
    return-object v2

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
