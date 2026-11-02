.class public final synthetic Ltx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:B

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Lon2;


# direct methods
.method public synthetic constructor <init>(Lgw5;Ldn2;Ldn2;II)V
    .locals 1

    .line 18
    const/4 v0, 0x1

    iput-byte v0, p0, Ltx2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltx2;->f0:Ljava/lang/Object;

    iput-object p2, p0, Ltx2;->g0:Ljava/lang/Object;

    iput-object p3, p0, Ltx2;->h0:Lon2;

    iput p4, p0, Ltx2;->Y:I

    iput-byte p5, p0, Ltx2;->Z:B

    return-void
.end method

.method public synthetic constructor <init>(Lkx4;Ljava/lang/String;Lzy0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Ltx2;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ltx2;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ltx2;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ltx2;->h0:Lon2;

    .line 12
    .line 13
    iput p4, p0, Ltx2;->Y:I

    .line 14
    .line 15
    iput-byte p5, p0, Ltx2;->Z:B

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Ltx2;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Ltx2;->Y:I

    .line 8
    .line 9
    iget-object v4, v0, Ltx2;->h0:Lon2;

    .line 10
    .line 11
    iget-object v5, v0, Ltx2;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Ltx2;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v7, v6

    .line 19
    check-cast v7, Lgw5;

    .line 20
    .line 21
    move-object v8, v5

    .line 22
    check-cast v8, Ldn2;

    .line 23
    .line 24
    move-object v9, v4

    .line 25
    check-cast v9, Ldn2;

    .line 26
    .line 27
    move-object/from16 v10, p1

    .line 28
    .line 29
    check-cast v10, Llp2;

    .line 30
    .line 31
    move-object/from16 v1, p2

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    or-int/lit8 v1, v3, 0x1

    .line 39
    .line 40
    invoke-static {v1}, Lw79;->P(I)I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    iget-byte v12, v0, Ltx2;->Z:B

    .line 45
    .line 46
    invoke-static/range {v7 .. v12}, Lyn0;->l(Lgw5;Ldn2;Ldn2;Llp2;II)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :pswitch_0
    move-object v13, v6

    .line 51
    check-cast v13, Lkx4;

    .line 52
    .line 53
    move-object v14, v5

    .line 54
    check-cast v14, Ljava/lang/String;

    .line 55
    .line 56
    move-object v15, v4

    .line 57
    check-cast v15, Lzy0;

    .line 58
    .line 59
    move-object/from16 v16, p1

    .line 60
    .line 61
    check-cast v16, Llp2;

    .line 62
    .line 63
    move-object/from16 v1, p2

    .line 64
    .line 65
    check-cast v1, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    or-int/lit8 v1, v3, 0x1

    .line 71
    .line 72
    invoke-static {v1}, Lw79;->P(I)I

    .line 73
    .line 74
    .line 75
    move-result v17

    .line 76
    iget-byte v0, v0, Ltx2;->Z:B

    .line 77
    .line 78
    move/from16 v18, v0

    .line 79
    .line 80
    invoke-static/range {v13 .. v18}, Lci8;->a(Lkx4;Ljava/lang/String;Lzy0;Llp2;II)V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
