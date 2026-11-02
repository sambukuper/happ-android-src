.class public final synthetic Lws7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Z

.field public final synthetic f0:Lqs7;

.field public final synthetic g0:Lgn2;

.field public final synthetic h0:Lkx4;

.field public final synthetic i0:I


# direct methods
.method public synthetic constructor <init>(ZZLqs7;Lgn2;Lkx4;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lws7;->X:B

    .line 2
    .line 3
    iput-boolean p1, p0, Lws7;->Y:Z

    .line 4
    .line 5
    iput-boolean p2, p0, Lws7;->Z:Z

    .line 6
    .line 7
    iput-object p3, p0, Lws7;->f0:Lqs7;

    .line 8
    .line 9
    iput-object p4, p0, Lws7;->g0:Lgn2;

    .line 10
    .line 11
    iput-object p5, p0, Lws7;->h0:Lkx4;

    .line 12
    .line 13
    iput p6, p0, Lws7;->i0:I

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lws7;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Lws7;->i0:I

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v9, p1

    .line 13
    .line 14
    check-cast v9, Llp2;

    .line 15
    .line 16
    move-object/from16 v1, p2

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    or-int/lit8 v1, v3, 0x1

    .line 24
    .line 25
    invoke-static {v1}, Lw79;->P(I)I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    iget-boolean v4, v0, Lws7;->Y:Z

    .line 30
    .line 31
    iget-boolean v5, v0, Lws7;->Z:Z

    .line 32
    .line 33
    iget-object v6, v0, Lws7;->f0:Lqs7;

    .line 34
    .line 35
    iget-object v7, v0, Lws7;->g0:Lgn2;

    .line 36
    .line 37
    iget-object v8, v0, Lws7;->h0:Lkx4;

    .line 38
    .line 39
    invoke-static/range {v4 .. v10}, Lbt7;->a(ZZLqs7;Lgn2;Lkx4;Llp2;I)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :pswitch_0
    move-object/from16 v16, p1

    .line 44
    .line 45
    check-cast v16, Llp2;

    .line 46
    .line 47
    move-object/from16 v1, p2

    .line 48
    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    or-int/lit8 v1, v3, 0x1

    .line 55
    .line 56
    invoke-static {v1}, Lw79;->P(I)I

    .line 57
    .line 58
    .line 59
    move-result v17

    .line 60
    iget-boolean v11, v0, Lws7;->Y:Z

    .line 61
    .line 62
    iget-boolean v12, v0, Lws7;->Z:Z

    .line 63
    .line 64
    iget-object v13, v0, Lws7;->f0:Lqs7;

    .line 65
    .line 66
    iget-object v14, v0, Lws7;->g0:Lgn2;

    .line 67
    .line 68
    iget-object v15, v0, Lws7;->h0:Lkx4;

    .line 69
    .line 70
    invoke-static/range {v11 .. v17}, Lys7;->a(ZZLqs7;Lgn2;Lkx4;Llp2;I)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
