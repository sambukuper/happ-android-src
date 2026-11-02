.class public final synthetic Lt43;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ldn2;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Z

.field public final synthetic f0:Ls43;

.field public final synthetic g0:Lxz4;

.field public final synthetic h0:Lx67;

.field public final synthetic i0:Lzy0;

.field public final synthetic j0:I

.field public final synthetic k0:B


# direct methods
.method public synthetic constructor <init>(Ldn2;Lkx4;ZLs43;Lxz4;Lx67;Lzy0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt43;->X:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Lt43;->Y:Lkx4;

    .line 7
    .line 8
    iput-boolean p3, p0, Lt43;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Lt43;->f0:Ls43;

    .line 11
    .line 12
    iput-object p5, p0, Lt43;->g0:Lxz4;

    .line 13
    .line 14
    iput-object p6, p0, Lt43;->h0:Lx67;

    .line 15
    .line 16
    iput-object p7, p0, Lt43;->i0:Lzy0;

    .line 17
    .line 18
    iput p8, p0, Lt43;->j0:I

    .line 19
    .line 20
    iput-byte p9, p0, Lt43;->k0:B

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lt43;->j0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lt43;->X:Ldn2;

    .line 18
    .line 19
    iget-object v1, p0, Lt43;->Y:Lkx4;

    .line 20
    .line 21
    iget-boolean v2, p0, Lt43;->Z:Z

    .line 22
    .line 23
    iget-object v3, p0, Lt43;->f0:Ls43;

    .line 24
    .line 25
    iget-object v4, p0, Lt43;->g0:Lxz4;

    .line 26
    .line 27
    iget-object v5, p0, Lt43;->h0:Lx67;

    .line 28
    .line 29
    iget-object v6, p0, Lt43;->i0:Lzy0;

    .line 30
    .line 31
    iget-byte v9, p0, Lt43;->k0:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lw45;->c(Ldn2;Lkx4;ZLs43;Lxz4;Lx67;Lzy0;Llp2;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Ldn8;->a:Ldn8;

    .line 37
    .line 38
    return-object p0
.end method
