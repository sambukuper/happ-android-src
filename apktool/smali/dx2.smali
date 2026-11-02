.class public final synthetic Ldx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lj74;

.field public final synthetic Z:F

.field public final synthetic f0:Lgg5;

.field public final synthetic g0:Lgt;

.field public final synthetic h0:Lp8;

.field public final synthetic i0:Lhe2;

.field public final synthetic j0:Z

.field public final synthetic k0:Ltd;

.field public final synthetic l0:Z

.field public final synthetic m0:Lgn2;

.field public final synthetic n0:I

.field public final synthetic o0:S


# direct methods
.method public synthetic constructor <init>(Lkx4;Lj74;FLgg5;Lgt;Lp8;Lhe2;ZLtd;ZLgn2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldx2;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Ldx2;->Y:Lj74;

    .line 7
    .line 8
    iput p3, p0, Ldx2;->Z:F

    .line 9
    .line 10
    iput-object p4, p0, Ldx2;->f0:Lgg5;

    .line 11
    .line 12
    iput-object p5, p0, Ldx2;->g0:Lgt;

    .line 13
    .line 14
    iput-object p6, p0, Ldx2;->h0:Lp8;

    .line 15
    .line 16
    iput-object p7, p0, Ldx2;->i0:Lhe2;

    .line 17
    .line 18
    iput-boolean p8, p0, Ldx2;->j0:Z

    .line 19
    .line 20
    iput-object p9, p0, Ldx2;->k0:Ltd;

    .line 21
    .line 22
    iput-boolean p10, p0, Ldx2;->l0:Z

    .line 23
    .line 24
    iput-object p11, p0, Ldx2;->m0:Lgn2;

    .line 25
    .line 26
    iput p12, p0, Ldx2;->n0:I

    .line 27
    .line 28
    iput-short p13, p0, Ldx2;->o0:S

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, Llp2;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, Ldx2;->n0:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-static {v0}, Lw79;->P(I)I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    iget-object v0, p0, Ldx2;->X:Lkx4;

    .line 20
    .line 21
    iget-object v1, p0, Ldx2;->Y:Lj74;

    .line 22
    .line 23
    iget v2, p0, Ldx2;->Z:F

    .line 24
    .line 25
    iget-object v3, p0, Ldx2;->f0:Lgg5;

    .line 26
    .line 27
    iget-object v4, p0, Ldx2;->g0:Lgt;

    .line 28
    .line 29
    iget-object v5, p0, Ldx2;->h0:Lp8;

    .line 30
    .line 31
    iget-object v6, p0, Ldx2;->i0:Lhe2;

    .line 32
    .line 33
    iget-boolean v7, p0, Ldx2;->j0:Z

    .line 34
    .line 35
    iget-object v8, p0, Ldx2;->k0:Ltd;

    .line 36
    .line 37
    iget-boolean v9, p0, Ldx2;->l0:Z

    .line 38
    .line 39
    iget-object v10, p0, Ldx2;->m0:Lgn2;

    .line 40
    .line 41
    iget-short v13, p0, Ldx2;->o0:S

    .line 42
    .line 43
    invoke-static/range {v0 .. v13}, Ljb5;->a(Lkx4;Lj74;FLgg5;Lgt;Lp8;Lhe2;ZLtd;ZLgn2;Llp2;II)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Ldn8;->a:Ldn8;

    .line 47
    .line 48
    return-object p0
.end method
