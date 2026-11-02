.class public final synthetic Lrx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Lrn2;

.field public final synthetic f0:Lrn2;

.field public final synthetic g0:B

.field public final synthetic h0:J

.field public final synthetic i0:Lv09;

.field public final synthetic j0:Lzy0;

.field public final synthetic k0:I


# direct methods
.method public synthetic constructor <init>(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrx2;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lrx2;->Y:Lzy0;

    .line 7
    .line 8
    iput-object p3, p0, Lrx2;->Z:Lrn2;

    .line 9
    .line 10
    iput-object p4, p0, Lrx2;->f0:Lrn2;

    .line 11
    .line 12
    iput-byte p5, p0, Lrx2;->g0:B

    .line 13
    .line 14
    iput-wide p6, p0, Lrx2;->h0:J

    .line 15
    .line 16
    iput-object p8, p0, Lrx2;->i0:Lv09;

    .line 17
    .line 18
    iput-object p9, p0, Lrx2;->j0:Lzy0;

    .line 19
    .line 20
    iput p10, p0, Lrx2;->k0:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    iget p1, p0, Lrx2;->k0:I

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
    iget-object v0, p0, Lrx2;->X:Lkx4;

    .line 18
    .line 19
    iget-object v1, p0, Lrx2;->Y:Lzy0;

    .line 20
    .line 21
    iget-object v2, p0, Lrx2;->Z:Lrn2;

    .line 22
    .line 23
    iget-object v3, p0, Lrx2;->f0:Lrn2;

    .line 24
    .line 25
    iget-byte v4, p0, Lrx2;->g0:B

    .line 26
    .line 27
    iget-wide v5, p0, Lrx2;->h0:J

    .line 28
    .line 29
    iget-object v7, p0, Lrx2;->i0:Lv09;

    .line 30
    .line 31
    iget-object v8, p0, Lrx2;->j0:Lzy0;

    .line 32
    .line 33
    invoke-static/range {v0 .. v10}, Lsx2;->b(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Llp2;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Ldn8;->a:Ldn8;

    .line 37
    .line 38
    return-object p0
.end method
