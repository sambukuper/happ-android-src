.class public final synthetic Lix2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Z

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lgn2;Lkx4;Ly68;Lo88;ZLwx3;Lw58;Lde3;I)V
    .locals 0

    .line 26
    const/4 p10, 0x0

    iput-byte p10, p0, Lix2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lix2;->g0:Ljava/lang/Object;

    iput-object p2, p0, Lix2;->f0:Lgn2;

    iput-object p3, p0, Lix2;->Y:Lkx4;

    iput-object p4, p0, Lix2;->h0:Ljava/lang/Object;

    iput-object p5, p0, Lix2;->i0:Ljava/lang/Object;

    iput-boolean p6, p0, Lix2;->Z:Z

    iput-object p7, p0, Lix2;->j0:Ljava/lang/Object;

    iput-object p8, p0, Lix2;->k0:Ljava/lang/Object;

    iput-object p9, p0, Lix2;->l0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkx4;Lj74;Lgg5;Lgt;Lp8;Lhe2;ZLtd;Lgn2;I)V
    .locals 0

    .line 1
    const/4 p10, 0x1

    .line 2
    iput-byte p10, p0, Lix2;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lix2;->Y:Lkx4;

    .line 8
    .line 9
    iput-object p2, p0, Lix2;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lix2;->h0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lix2;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lix2;->j0:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lix2;->k0:Ljava/lang/Object;

    .line 18
    .line 19
    iput-boolean p7, p0, Lix2;->Z:Z

    .line 20
    .line 21
    iput-object p8, p0, Lix2;->l0:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p9, p0, Lix2;->f0:Lgn2;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lix2;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Lix2;->l0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lix2;->k0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lix2;->j0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lix2;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lix2;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, Lix2;->g0:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v10, v8

    .line 23
    check-cast v10, Lj74;

    .line 24
    .line 25
    move-object v11, v7

    .line 26
    check-cast v11, Lgg5;

    .line 27
    .line 28
    move-object v12, v6

    .line 29
    check-cast v12, Lgt;

    .line 30
    .line 31
    move-object v13, v5

    .line 32
    check-cast v13, Lp8;

    .line 33
    .line 34
    move-object v14, v4

    .line 35
    check-cast v14, Lhe2;

    .line 36
    .line 37
    move-object/from16 v16, v3

    .line 38
    .line 39
    check-cast v16, Ltd;

    .line 40
    .line 41
    move-object/from16 v18, p1

    .line 42
    .line 43
    check-cast v18, Llp2;

    .line 44
    .line 45
    move-object/from16 v1, p2

    .line 46
    .line 47
    check-cast v1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-static {v1}, Lw79;->P(I)I

    .line 54
    .line 55
    .line 56
    move-result v19

    .line 57
    iget-object v9, v0, Lix2;->Y:Lkx4;

    .line 58
    .line 59
    iget-boolean v15, v0, Lix2;->Z:Z

    .line 60
    .line 61
    iget-object v0, v0, Lix2;->f0:Lgn2;

    .line 62
    .line 63
    move-object/from16 v17, v0

    .line 64
    .line 65
    invoke-static/range {v9 .. v19}, Ljb5;->c(Lkx4;Lj74;Lgg5;Lgt;Lp8;Lhe2;ZLtd;Lgn2;Llp2;I)V

    .line 66
    .line 67
    .line 68
    return-object v2

    .line 69
    :pswitch_0
    move-object/from16 v20, v8

    .line 70
    .line 71
    check-cast v20, Ljava/lang/String;

    .line 72
    .line 73
    move-object/from16 v23, v7

    .line 74
    .line 75
    check-cast v23, Ly68;

    .line 76
    .line 77
    move-object/from16 v24, v6

    .line 78
    .line 79
    check-cast v24, Lo88;

    .line 80
    .line 81
    move-object/from16 v26, v5

    .line 82
    .line 83
    check-cast v26, Lwx3;

    .line 84
    .line 85
    move-object/from16 v27, v4

    .line 86
    .line 87
    check-cast v27, Lw58;

    .line 88
    .line 89
    move-object/from16 v28, v3

    .line 90
    .line 91
    check-cast v28, Lde3;

    .line 92
    .line 93
    move-object/from16 v29, p1

    .line 94
    .line 95
    check-cast v29, Llp2;

    .line 96
    .line 97
    move-object/from16 v1, p2

    .line 98
    .line 99
    check-cast v1, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const/16 v1, 0x1b1

    .line 105
    .line 106
    invoke-static {v1}, Lw79;->P(I)I

    .line 107
    .line 108
    .line 109
    move-result v30

    .line 110
    iget-object v1, v0, Lix2;->f0:Lgn2;

    .line 111
    .line 112
    iget-object v3, v0, Lix2;->Y:Lkx4;

    .line 113
    .line 114
    iget-boolean v0, v0, Lix2;->Z:Z

    .line 115
    .line 116
    move/from16 v25, v0

    .line 117
    .line 118
    move-object/from16 v21, v1

    .line 119
    .line 120
    move-object/from16 v22, v3

    .line 121
    .line 122
    invoke-static/range {v20 .. v30}, Lx97;->a(Ljava/lang/String;Lgn2;Lkx4;Ly68;Lo88;ZLwx3;Lw58;Lde3;Llp2;I)V

    .line 123
    .line 124
    .line 125
    return-object v2

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
