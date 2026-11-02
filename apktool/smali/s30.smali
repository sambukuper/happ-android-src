.class public final synthetic Ls30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ly68;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Z

.field public final synthetic f0:Lde3;

.field public final synthetic g0:Lo88;

.field public final synthetic h0:Lwx3;

.field public final synthetic i0:Lw58;

.field public final synthetic j0:Lxz4;

.field public final synthetic k0:Ld90;

.field public final synthetic l0:Lo48;

.field public final synthetic m0:Lay6;

.field public final synthetic n0:I

.field public final synthetic o0:I


# direct methods
.method public synthetic constructor <init>(Ly68;Lkx4;ZLde3;Lo88;Lwx3;Lw58;Lxz4;Ld90;Lo48;Lay6;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls30;->X:Ly68;

    .line 5
    .line 6
    iput-object p2, p0, Ls30;->Y:Lkx4;

    .line 7
    .line 8
    iput-boolean p3, p0, Ls30;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Ls30;->f0:Lde3;

    .line 11
    .line 12
    iput-object p5, p0, Ls30;->g0:Lo88;

    .line 13
    .line 14
    iput-object p6, p0, Ls30;->h0:Lwx3;

    .line 15
    .line 16
    iput-object p7, p0, Ls30;->i0:Lw58;

    .line 17
    .line 18
    iput-object p8, p0, Ls30;->j0:Lxz4;

    .line 19
    .line 20
    iput-object p9, p0, Ls30;->k0:Ld90;

    .line 21
    .line 22
    iput-object p10, p0, Ls30;->l0:Lo48;

    .line 23
    .line 24
    iput-object p11, p0, Ls30;->m0:Lay6;

    .line 25
    .line 26
    iput p12, p0, Ls30;->n0:I

    .line 27
    .line 28
    iput p13, p0, Ls30;->o0:I

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
    iget v0, p0, Ls30;->n0:I

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
    iget v0, p0, Ls30;->o0:I

    .line 20
    .line 21
    invoke-static {v0}, Lw79;->P(I)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    iget-object v0, p0, Ls30;->X:Ly68;

    .line 26
    .line 27
    iget-object v1, p0, Ls30;->Y:Lkx4;

    .line 28
    .line 29
    iget-boolean v2, p0, Ls30;->Z:Z

    .line 30
    .line 31
    iget-object v3, p0, Ls30;->f0:Lde3;

    .line 32
    .line 33
    iget-object v4, p0, Ls30;->g0:Lo88;

    .line 34
    .line 35
    iget-object v5, p0, Ls30;->h0:Lwx3;

    .line 36
    .line 37
    iget-object v6, p0, Ls30;->i0:Lw58;

    .line 38
    .line 39
    iget-object v7, p0, Ls30;->j0:Lxz4;

    .line 40
    .line 41
    iget-object v8, p0, Ls30;->k0:Ld90;

    .line 42
    .line 43
    iget-object v9, p0, Ls30;->l0:Lo48;

    .line 44
    .line 45
    iget-object v10, p0, Ls30;->m0:Lay6;

    .line 46
    .line 47
    invoke-static/range {v0 .. v13}, Lx30;->a(Ly68;Lkx4;ZLde3;Lo88;Lwx3;Lw58;Lxz4;Ld90;Lo48;Lay6;Llp2;II)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Ldn8;->a:Ldn8;

    .line 51
    .line 52
    return-object p0
.end method
