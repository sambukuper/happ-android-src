.class public final synthetic Lsa;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ldn2;

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Lrn2;

.field public final synthetic f0:Lrn2;

.field public final synthetic g0:Lx67;

.field public final synthetic h0:J

.field public final synthetic i0:J

.field public final synthetic j0:J

.field public final synthetic k0:J

.field public final synthetic l0:Lvn1;

.field public final synthetic m0:I


# direct methods
.method public synthetic constructor <init>(Ldn2;Lzy0;Lrn2;Lrn2;Lx67;JJJJLvn1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsa;->X:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Lsa;->Y:Lzy0;

    .line 7
    .line 8
    iput-object p3, p0, Lsa;->Z:Lrn2;

    .line 9
    .line 10
    iput-object p4, p0, Lsa;->f0:Lrn2;

    .line 11
    .line 12
    iput-object p5, p0, Lsa;->g0:Lx67;

    .line 13
    .line 14
    iput-wide p6, p0, Lsa;->h0:J

    .line 15
    .line 16
    iput-wide p8, p0, Lsa;->i0:J

    .line 17
    .line 18
    iput-wide p10, p0, Lsa;->j0:J

    .line 19
    .line 20
    iput-wide p12, p0, Lsa;->k0:J

    .line 21
    .line 22
    iput-object p14, p0, Lsa;->l0:Lvn1;

    .line 23
    .line 24
    iput p15, p0, Lsa;->m0:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, Llp2;

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
    iget v1, v0, Lsa;->m0:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Lw79;->P(I)I

    .line 19
    .line 20
    .line 21
    move-result v15

    .line 22
    iget-object v1, v0, Lsa;->X:Ldn2;

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    iget-object v1, v0, Lsa;->Y:Lzy0;

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    iget-object v2, v0, Lsa;->Z:Lrn2;

    .line 29
    .line 30
    move-object v4, v3

    .line 31
    iget-object v3, v0, Lsa;->f0:Lrn2;

    .line 32
    .line 33
    move-object v5, v4

    .line 34
    iget-object v4, v0, Lsa;->g0:Lx67;

    .line 35
    .line 36
    move-object v7, v5

    .line 37
    iget-wide v5, v0, Lsa;->h0:J

    .line 38
    .line 39
    move-object v9, v7

    .line 40
    iget-wide v7, v0, Lsa;->i0:J

    .line 41
    .line 42
    move-object v11, v9

    .line 43
    iget-wide v9, v0, Lsa;->j0:J

    .line 44
    .line 45
    move-object v13, v11

    .line 46
    iget-wide v11, v0, Lsa;->k0:J

    .line 47
    .line 48
    iget-object v0, v0, Lsa;->l0:Lvn1;

    .line 49
    .line 50
    move-object/from16 v16, v13

    .line 51
    .line 52
    move-object v13, v0

    .line 53
    move-object/from16 v0, v16

    .line 54
    .line 55
    invoke-static/range {v0 .. v15}, Lz51;->a(Ldn2;Lzy0;Lrn2;Lrn2;Lx67;JJJJLvn1;Llp2;I)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Ldn8;->a:Ldn8;

    .line 59
    .line 60
    return-object v0
.end method
