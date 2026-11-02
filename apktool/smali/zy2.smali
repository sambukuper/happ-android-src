.class public final synthetic Lzy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ljava/lang/String;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Lo88;

.field public final synthetic f0:I

.field public final synthetic g0:I

.field public final synthetic h0:I

.field public final synthetic i0:I

.field public final synthetic j0:Z

.field public final synthetic k0:Lgn2;

.field public final synthetic l0:I

.field public final synthetic m0:S


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzy2;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lzy2;->Y:Lkx4;

    .line 7
    .line 8
    iput-object p3, p0, Lzy2;->Z:Lo88;

    .line 9
    .line 10
    iput p4, p0, Lzy2;->f0:I

    .line 11
    .line 12
    iput p5, p0, Lzy2;->g0:I

    .line 13
    .line 14
    iput p6, p0, Lzy2;->h0:I

    .line 15
    .line 16
    iput p7, p0, Lzy2;->i0:I

    .line 17
    .line 18
    iput-boolean p8, p0, Lzy2;->j0:Z

    .line 19
    .line 20
    iput-object p9, p0, Lzy2;->k0:Lgn2;

    .line 21
    .line 22
    iput p10, p0, Lzy2;->l0:I

    .line 23
    .line 24
    iput-short p11, p0, Lzy2;->m0:S

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
    iget p1, p0, Lzy2;->l0:I

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
    iget-object v0, p0, Lzy2;->X:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lzy2;->Y:Lkx4;

    .line 20
    .line 21
    iget-object v2, p0, Lzy2;->Z:Lo88;

    .line 22
    .line 23
    iget v3, p0, Lzy2;->f0:I

    .line 24
    .line 25
    iget v4, p0, Lzy2;->g0:I

    .line 26
    .line 27
    iget v5, p0, Lzy2;->h0:I

    .line 28
    .line 29
    iget v6, p0, Lzy2;->i0:I

    .line 30
    .line 31
    iget-boolean v7, p0, Lzy2;->j0:Z

    .line 32
    .line 33
    iget-object v8, p0, Lzy2;->k0:Lgn2;

    .line 34
    .line 35
    iget-short v11, p0, Lzy2;->m0:S

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Ldn8;->a:Ldn8;

    .line 41
    .line 42
    return-object p0
.end method
