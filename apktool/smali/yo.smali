.class public final synthetic Lyo;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lre2;

.field public final synthetic Z:J

.field public final synthetic f0:J

.field public final synthetic g0:J

.field public final synthetic h0:J

.field public final synthetic i0:Lzy0;

.field public final synthetic j0:Lo88;

.field public final synthetic k0:Lo88;

.field public final synthetic l0:Ldn2;

.field public final synthetic m0:Lzy0;

.field public final synthetic n0:Lzy0;

.field public final synthetic o0:F


# direct methods
.method public synthetic constructor <init>(Lkx4;Lre2;JJJJLzy0;Lo88;Lo88;Ldn2;Lzy0;Lzy0;FI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyo;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lyo;->Y:Lre2;

    .line 7
    .line 8
    iput-wide p3, p0, Lyo;->Z:J

    .line 9
    .line 10
    iput-wide p5, p0, Lyo;->f0:J

    .line 11
    .line 12
    iput-wide p7, p0, Lyo;->g0:J

    .line 13
    .line 14
    iput-wide p9, p0, Lyo;->h0:J

    .line 15
    .line 16
    iput-object p11, p0, Lyo;->i0:Lzy0;

    .line 17
    .line 18
    iput-object p12, p0, Lyo;->j0:Lo88;

    .line 19
    .line 20
    iput-object p13, p0, Lyo;->k0:Lo88;

    .line 21
    .line 22
    iput-object p14, p0, Lyo;->l0:Ldn2;

    .line 23
    .line 24
    iput-object p15, p0, Lyo;->m0:Lzy0;

    .line 25
    .line 26
    move-object/from16 p1, p16

    .line 27
    .line 28
    iput-object p1, p0, Lyo;->n0:Lzy0;

    .line 29
    .line 30
    move/from16 p1, p17

    .line 31
    .line 32
    iput p1, p0, Lyo;->o0:F

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v17, p1

    .line 4
    .line 5
    check-cast v17, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, Lw79;->P(I)I

    .line 16
    .line 17
    .line 18
    move-result v18

    .line 19
    iget-object v1, v0, Lyo;->X:Lkx4;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, Lyo;->Y:Lre2;

    .line 23
    .line 24
    move-object v4, v2

    .line 25
    iget-wide v2, v0, Lyo;->Z:J

    .line 26
    .line 27
    move-object v6, v4

    .line 28
    iget-wide v4, v0, Lyo;->f0:J

    .line 29
    .line 30
    move-object v8, v6

    .line 31
    iget-wide v6, v0, Lyo;->g0:J

    .line 32
    .line 33
    move-object v10, v8

    .line 34
    iget-wide v8, v0, Lyo;->h0:J

    .line 35
    .line 36
    move-object v11, v10

    .line 37
    iget-object v10, v0, Lyo;->i0:Lzy0;

    .line 38
    .line 39
    move-object v12, v11

    .line 40
    iget-object v11, v0, Lyo;->j0:Lo88;

    .line 41
    .line 42
    move-object v13, v12

    .line 43
    iget-object v12, v0, Lyo;->k0:Lo88;

    .line 44
    .line 45
    move-object v14, v13

    .line 46
    iget-object v13, v0, Lyo;->l0:Ldn2;

    .line 47
    .line 48
    move-object v15, v14

    .line 49
    iget-object v14, v0, Lyo;->m0:Lzy0;

    .line 50
    .line 51
    move-object/from16 v16, v15

    .line 52
    .line 53
    iget-object v15, v0, Lyo;->n0:Lzy0;

    .line 54
    .line 55
    iget v0, v0, Lyo;->o0:F

    .line 56
    .line 57
    move-object/from16 v19, v16

    .line 58
    .line 59
    move/from16 v16, v0

    .line 60
    .line 61
    move-object/from16 v0, v19

    .line 62
    .line 63
    invoke-static/range {v0 .. v18}, Lzo;->c(Lkx4;Lre2;JJJJLzy0;Lo88;Lo88;Ldn2;Lzy0;Lzy0;FLlp2;I)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Ldn8;->a:Ldn8;

    .line 67
    .line 68
    return-object v0
.end method
