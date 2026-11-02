.class public final synthetic Lk30;
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

.field public final synthetic n0:B

.field public final synthetic o0:S


# direct methods
.method public synthetic constructor <init>(Ly68;Lkx4;ZLde3;Lo88;Lwx3;Lw58;Lxz4;Ld90;Lo48;Lay6;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk30;->X:Ly68;

    .line 5
    .line 6
    iput-object p2, p0, Lk30;->Y:Lkx4;

    .line 7
    .line 8
    iput-boolean p3, p0, Lk30;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Lk30;->f0:Lde3;

    .line 11
    .line 12
    iput-object p5, p0, Lk30;->g0:Lo88;

    .line 13
    .line 14
    iput-object p6, p0, Lk30;->h0:Lwx3;

    .line 15
    .line 16
    iput-object p7, p0, Lk30;->i0:Lw58;

    .line 17
    .line 18
    iput-object p8, p0, Lk30;->j0:Lxz4;

    .line 19
    .line 20
    iput-object p9, p0, Lk30;->k0:Ld90;

    .line 21
    .line 22
    iput-object p10, p0, Lk30;->l0:Lo48;

    .line 23
    .line 24
    iput-object p11, p0, Lk30;->m0:Lay6;

    .line 25
    .line 26
    iput-byte p13, p0, Lk30;->n0:B

    .line 27
    .line 28
    iput-short p14, p0, Lk30;->o0:S

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    check-cast v11, Llp2;

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
    move-result v12

    .line 19
    iget-byte v1, v0, Lk30;->n0:B

    .line 20
    .line 21
    invoke-static {v1}, Lw79;->P(I)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    iget-object v1, v0, Lk30;->X:Ly68;

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    iget-object v1, v0, Lk30;->Y:Lkx4;

    .line 29
    .line 30
    move-object v3, v2

    .line 31
    iget-boolean v2, v0, Lk30;->Z:Z

    .line 32
    .line 33
    move-object v4, v3

    .line 34
    iget-object v3, v0, Lk30;->f0:Lde3;

    .line 35
    .line 36
    move-object v5, v4

    .line 37
    iget-object v4, v0, Lk30;->g0:Lo88;

    .line 38
    .line 39
    move-object v6, v5

    .line 40
    iget-object v5, v0, Lk30;->h0:Lwx3;

    .line 41
    .line 42
    move-object v7, v6

    .line 43
    iget-object v6, v0, Lk30;->i0:Lw58;

    .line 44
    .line 45
    move-object v8, v7

    .line 46
    iget-object v7, v0, Lk30;->j0:Lxz4;

    .line 47
    .line 48
    move-object v9, v8

    .line 49
    iget-object v8, v0, Lk30;->k0:Ld90;

    .line 50
    .line 51
    move-object v10, v9

    .line 52
    iget-object v9, v0, Lk30;->l0:Lo48;

    .line 53
    .line 54
    move-object v14, v10

    .line 55
    iget-object v10, v0, Lk30;->m0:Lay6;

    .line 56
    .line 57
    iget-short v0, v0, Lk30;->o0:S

    .line 58
    .line 59
    move-object v15, v14

    .line 60
    move v14, v0

    .line 61
    move-object v0, v15

    .line 62
    invoke-static/range {v0 .. v14}, Lx30;->b(Ly68;Lkx4;ZLde3;Lo88;Lwx3;Lw58;Lxz4;Ld90;Lo48;Lay6;Llp2;III)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Ldn8;->a:Ldn8;

    .line 66
    .line 67
    return-object v0
.end method
