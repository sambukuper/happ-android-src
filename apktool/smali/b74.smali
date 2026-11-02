.class public final synthetic Lb74;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lj74;

.field public final synthetic Z:Lgg5;

.field public final synthetic f0:Lhe2;

.field public final synthetic g0:Z

.field public final synthetic h0:Ltd;

.field public final synthetic i0:Lp8;

.field public final synthetic j0:Lgt;

.field public final synthetic k0:Lgn2;

.field public final synthetic l0:I

.field public final synthetic m0:I


# direct methods
.method public synthetic constructor <init>(Lkx4;Lj74;Lgg5;Lhe2;ZLtd;Lp8;Lgt;Lgn2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb74;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lb74;->Y:Lj74;

    .line 7
    .line 8
    iput-object p3, p0, Lb74;->Z:Lgg5;

    .line 9
    .line 10
    iput-object p4, p0, Lb74;->f0:Lhe2;

    .line 11
    .line 12
    iput-boolean p5, p0, Lb74;->g0:Z

    .line 13
    .line 14
    iput-object p6, p0, Lb74;->h0:Ltd;

    .line 15
    .line 16
    iput-object p7, p0, Lb74;->i0:Lp8;

    .line 17
    .line 18
    iput-object p8, p0, Lb74;->j0:Lgt;

    .line 19
    .line 20
    iput-object p9, p0, Lb74;->k0:Lgn2;

    .line 21
    .line 22
    iput p10, p0, Lb74;->l0:I

    .line 23
    .line 24
    iput p11, p0, Lb74;->m0:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lb74;->l0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget p1, p0, Lb74;->m0:I

    .line 18
    .line 19
    invoke-static {p1}, Lw79;->P(I)I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    iget-object v0, p0, Lb74;->X:Lkx4;

    .line 24
    .line 25
    iget-object v1, p0, Lb74;->Y:Lj74;

    .line 26
    .line 27
    iget-object v2, p0, Lb74;->Z:Lgg5;

    .line 28
    .line 29
    iget-object v3, p0, Lb74;->f0:Lhe2;

    .line 30
    .line 31
    iget-boolean v4, p0, Lb74;->g0:Z

    .line 32
    .line 33
    iget-object v5, p0, Lb74;->h0:Ltd;

    .line 34
    .line 35
    iget-object v6, p0, Lb74;->i0:Lp8;

    .line 36
    .line 37
    iget-object v7, p0, Lb74;->j0:Lgt;

    .line 38
    .line 39
    iget-object v8, p0, Lb74;->k0:Lgn2;

    .line 40
    .line 41
    invoke-static/range {v0 .. v11}, Lw39;->d(Lkx4;Lj74;Lgg5;Lhe2;ZLtd;Lp8;Lgt;Lgn2;Llp2;II)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Ldn8;->a:Ldn8;

    .line 45
    .line 46
    return-object p0
.end method
