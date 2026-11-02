.class public final Lm8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lrn2;

.field public final synthetic Y:Lrn2;

.field public final synthetic Z:Lx67;

.field public final synthetic f0:J

.field public final synthetic g0:J

.field public final synthetic h0:J

.field public final synthetic i0:J

.field public final synthetic j0:Lzy0;


# direct methods
.method public constructor <init>(Lrn2;Lrn2;Lx67;JJJJLzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm8;->X:Lrn2;

    .line 5
    .line 6
    iput-object p2, p0, Lm8;->Y:Lrn2;

    .line 7
    .line 8
    iput-object p3, p0, Lm8;->Z:Lx67;

    .line 9
    .line 10
    iput-wide p4, p0, Lm8;->f0:J

    .line 11
    .line 12
    iput-wide p6, p0, Lm8;->g0:J

    .line 13
    .line 14
    iput-wide p8, p0, Lm8;->h0:J

    .line 15
    .line 16
    iput-wide p10, p0, Lm8;->i0:J

    .line 17
    .line 18
    iput-object p12, p0, Lm8;->j0:Lzy0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    check-cast v15, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    move v2, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    and-int/2addr v1, v4

    .line 25
    invoke-virtual {v15, v1, v2}, Llp2;->N(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    new-instance v1, Ll8;

    .line 32
    .line 33
    iget-object v2, v0, Lm8;->j0:Lzy0;

    .line 34
    .line 35
    invoke-direct {v1, v2, v4}, Ll8;-><init>(Lzy0;B)V

    .line 36
    .line 37
    .line 38
    const v2, 0x51830875

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v1, v15}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Lz68;->b:Ljw0;

    .line 46
    .line 47
    invoke-static {v2, v15}, Lkw0;->c(Ljw0;Llp2;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    iget-wide v13, v0, Lm8;->i0:J

    .line 52
    .line 53
    const/16 v16, 0x6

    .line 54
    .line 55
    move-object v2, v1

    .line 56
    move-object v3, v2

    .line 57
    iget-object v2, v0, Lm8;->X:Lrn2;

    .line 58
    .line 59
    move-object v4, v3

    .line 60
    iget-object v3, v0, Lm8;->Y:Lrn2;

    .line 61
    .line 62
    move-object v5, v4

    .line 63
    iget-object v4, v0, Lm8;->Z:Lx67;

    .line 64
    .line 65
    move-object v9, v5

    .line 66
    iget-wide v5, v0, Lm8;->f0:J

    .line 67
    .line 68
    move-object v11, v9

    .line 69
    iget-wide v9, v0, Lm8;->g0:J

    .line 70
    .line 71
    move-object v12, v2

    .line 72
    iget-wide v1, v0, Lm8;->h0:J

    .line 73
    .line 74
    move-object v0, v11

    .line 75
    move-wide/from16 v17, v1

    .line 76
    .line 77
    move-object v2, v12

    .line 78
    move-wide/from16 v11, v17

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-static/range {v0 .. v16}, Ln8;->a(Lzy0;Lkx4;Lrn2;Lrn2;Lx67;JJJJJLlp2;I)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v15}, Llp2;->Q()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object v0, Ldn8;->a:Ldn8;

    .line 89
    .line 90
    return-object v0
.end method
