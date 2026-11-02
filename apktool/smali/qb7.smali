.class public final synthetic Lqb7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:F

.field public final synthetic Y:Lgn2;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Ljb7;

.field public final synthetic g0:Lxz4;

.field public final synthetic h0:B

.field public final synthetic i0:Lzy0;

.field public final synthetic j0:Lsn2;

.field public final synthetic k0:Luu0;

.field public final synthetic l0:I


# direct methods
.method public synthetic constructor <init>(FLgn2;Lkx4;Ljb7;Lxz4;ILzy0;Lsn2;Luu0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lqb7;->X:F

    .line 5
    .line 6
    iput-object p2, p0, Lqb7;->Y:Lgn2;

    .line 7
    .line 8
    iput-object p3, p0, Lqb7;->Z:Lkx4;

    .line 9
    .line 10
    iput-object p4, p0, Lqb7;->f0:Ljb7;

    .line 11
    .line 12
    iput-object p5, p0, Lqb7;->g0:Lxz4;

    .line 13
    .line 14
    iput-byte p6, p0, Lqb7;->h0:B

    .line 15
    .line 16
    iput-object p7, p0, Lqb7;->i0:Lzy0;

    .line 17
    .line 18
    iput-object p8, p0, Lqb7;->j0:Lsn2;

    .line 19
    .line 20
    iput-object p9, p0, Lqb7;->k0:Luu0;

    .line 21
    .line 22
    iput p11, p0, Lqb7;->l0:I

    .line 23
    .line 24
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
    const p1, 0x6000001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lw79;->P(I)I

    .line 13
    .line 14
    .line 15
    move-result v10

    .line 16
    iget p1, p0, Lqb7;->l0:I

    .line 17
    .line 18
    invoke-static {p1}, Lw79;->P(I)I

    .line 19
    .line 20
    .line 21
    move-result v11

    .line 22
    iget v0, p0, Lqb7;->X:F

    .line 23
    .line 24
    iget-object v1, p0, Lqb7;->Y:Lgn2;

    .line 25
    .line 26
    iget-object v2, p0, Lqb7;->Z:Lkx4;

    .line 27
    .line 28
    iget-object v3, p0, Lqb7;->f0:Ljb7;

    .line 29
    .line 30
    iget-object v4, p0, Lqb7;->g0:Lxz4;

    .line 31
    .line 32
    iget-byte v5, p0, Lqb7;->h0:B

    .line 33
    .line 34
    iget-object v6, p0, Lqb7;->i0:Lzy0;

    .line 35
    .line 36
    iget-object v7, p0, Lqb7;->j0:Lsn2;

    .line 37
    .line 38
    iget-object v8, p0, Lqb7;->k0:Luu0;

    .line 39
    .line 40
    invoke-static/range {v0 .. v11}, Lvb7;->a(FLgn2;Lkx4;Ljb7;Lxz4;ILzy0;Lsn2;Luu0;Llp2;II)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Ldn8;->a:Ldn8;

    .line 44
    .line 45
    return-object p0
.end method
