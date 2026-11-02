.class public final Lbk;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Z

.field public final synthetic f0:Lkx4;

.field public final synthetic g0:Lg22;

.field public final synthetic h0:Lh62;

.field public final synthetic i0:Ljava/lang/String;

.field public final synthetic j0:Lzy0;


# direct methods
.method public synthetic constructor <init>(ZLkx4;Lg22;Lh62;Ljava/lang/String;Lzy0;IB)V
    .locals 0

    .line 1
    iput-byte p8, p0, Lbk;->Y:B

    .line 2
    .line 3
    iput-boolean p1, p0, Lbk;->Z:Z

    .line 4
    .line 5
    iput-object p2, p0, Lbk;->f0:Lkx4;

    .line 6
    .line 7
    iput-object p3, p0, Lbk;->g0:Lg22;

    .line 8
    .line 9
    iput-object p4, p0, Lbk;->h0:Lh62;

    .line 10
    .line 11
    iput-object p5, p0, Lbk;->i0:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p6, p0, Lbk;->j0:Lzy0;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lbk;->Y:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v9, p1

    .line 11
    .line 12
    check-cast v9, Llp2;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    const v1, 0x180187

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lw79;->P(I)I

    .line 25
    .line 26
    .line 27
    move-result v10

    .line 28
    iget-boolean v3, v0, Lbk;->Z:Z

    .line 29
    .line 30
    iget-object v4, v0, Lbk;->f0:Lkx4;

    .line 31
    .line 32
    iget-object v5, v0, Lbk;->g0:Lg22;

    .line 33
    .line 34
    iget-object v6, v0, Lbk;->h0:Lh62;

    .line 35
    .line 36
    iget-object v7, v0, Lbk;->i0:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v8, v0, Lbk;->j0:Lzy0;

    .line 39
    .line 40
    invoke-static/range {v3 .. v10}, Lzc1;->d(ZLkx4;Lg22;Lh62;Ljava/lang/String;Lzy0;Llp2;I)V

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :pswitch_0
    move-object/from16 v17, p1

    .line 45
    .line 46
    check-cast v17, Llp2;

    .line 47
    .line 48
    move-object/from16 v1, p2

    .line 49
    .line 50
    check-cast v1, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    const v1, 0x180007

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lw79;->P(I)I

    .line 59
    .line 60
    .line 61
    move-result v18

    .line 62
    iget-boolean v11, v0, Lbk;->Z:Z

    .line 63
    .line 64
    iget-object v12, v0, Lbk;->f0:Lkx4;

    .line 65
    .line 66
    iget-object v13, v0, Lbk;->g0:Lg22;

    .line 67
    .line 68
    iget-object v14, v0, Lbk;->h0:Lh62;

    .line 69
    .line 70
    iget-object v15, v0, Lbk;->i0:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v0, v0, Lbk;->j0:Lzy0;

    .line 73
    .line 74
    move-object/from16 v16, v0

    .line 75
    .line 76
    invoke-static/range {v11 .. v18}, Lzc1;->b(ZLkx4;Lg22;Lh62;Ljava/lang/String;Lzy0;Llp2;I)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
