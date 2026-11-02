.class public final Lak;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Y:Z

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Lg22;

.field public final synthetic g0:Lh62;

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:Lzy0;

.field public final synthetic j0:I

.field public final synthetic k0:B


# direct methods
.method public constructor <init>(ZLkx4;Lg22;Lh62;Ljava/lang/String;Lzy0;II)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lak;->Y:Z

    .line 2
    .line 3
    iput-object p2, p0, Lak;->Z:Lkx4;

    .line 4
    .line 5
    iput-object p3, p0, Lak;->f0:Lg22;

    .line 6
    .line 7
    iput-object p4, p0, Lak;->g0:Lh62;

    .line 8
    .line 9
    iput-object p5, p0, Lak;->h0:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lak;->i0:Lzy0;

    .line 12
    .line 13
    iput p7, p0, Lak;->j0:I

    .line 14
    .line 15
    iput-byte p8, p0, Lak;->k0:B

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lak;->j0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-byte v8, p0, Lak;->k0:B

    .line 18
    .line 19
    iget-boolean v0, p0, Lak;->Y:Z

    .line 20
    .line 21
    iget-object v1, p0, Lak;->Z:Lkx4;

    .line 22
    .line 23
    iget-object v2, p0, Lak;->f0:Lg22;

    .line 24
    .line 25
    iget-object v3, p0, Lak;->g0:Lh62;

    .line 26
    .line 27
    iget-object v4, p0, Lak;->h0:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v5, p0, Lak;->i0:Lzy0;

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Lzc1;->c(ZLkx4;Lg22;Lh62;Ljava/lang/String;Lzy0;Llp2;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Ldn8;->a:Ldn8;

    .line 35
    .line 36
    return-object p0
.end method
