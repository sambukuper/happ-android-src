.class public final synthetic Lob7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lpb7;

.field public final synthetic Y:Lwb7;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Ljb7;

.field public final synthetic g0:Lrn2;

.field public final synthetic h0:Lsn2;

.field public final synthetic i0:F

.field public final synthetic j0:F

.field public final synthetic k0:I

.field public final synthetic l0:I


# direct methods
.method public synthetic constructor <init>(Lpb7;Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lob7;->X:Lpb7;

    .line 5
    .line 6
    iput-object p2, p0, Lob7;->Y:Lwb7;

    .line 7
    .line 8
    iput-object p3, p0, Lob7;->Z:Lkx4;

    .line 9
    .line 10
    iput-object p4, p0, Lob7;->f0:Ljb7;

    .line 11
    .line 12
    iput-object p5, p0, Lob7;->g0:Lrn2;

    .line 13
    .line 14
    iput-object p6, p0, Lob7;->h0:Lsn2;

    .line 15
    .line 16
    iput p7, p0, Lob7;->i0:F

    .line 17
    .line 18
    iput p8, p0, Lob7;->j0:F

    .line 19
    .line 20
    iput p9, p0, Lob7;->k0:I

    .line 21
    .line 22
    iput p10, p0, Lob7;->l0:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lob7;->k0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget p1, p0, Lob7;->l0:I

    .line 18
    .line 19
    invoke-static {p1}, Lw79;->P(I)I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    iget-object v0, p0, Lob7;->X:Lpb7;

    .line 24
    .line 25
    iget-object v1, p0, Lob7;->Y:Lwb7;

    .line 26
    .line 27
    iget-object v2, p0, Lob7;->Z:Lkx4;

    .line 28
    .line 29
    iget-object v3, p0, Lob7;->f0:Ljb7;

    .line 30
    .line 31
    iget-object v4, p0, Lob7;->g0:Lrn2;

    .line 32
    .line 33
    iget-object v5, p0, Lob7;->h0:Lsn2;

    .line 34
    .line 35
    iget v6, p0, Lob7;->i0:F

    .line 36
    .line 37
    iget v7, p0, Lob7;->j0:F

    .line 38
    .line 39
    invoke-virtual/range {v0 .. v10}, Lpb7;->c(Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFLlp2;II)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Ldn8;->a:Ldn8;

    .line 43
    .line 44
    return-object p0
.end method
