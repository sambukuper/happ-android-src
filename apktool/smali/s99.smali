.class public final Ls99;
.super Lt99;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final transient Z:I

.field public final transient f0:I

.field public final synthetic g0:Lt99;


# direct methods
.method public constructor <init>(Lt99;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls99;->g0:Lt99;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Ls99;->Z:I

    .line 7
    .line 8
    iput p3, p0, Ls99;->f0:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ls99;->g0:Lt99;

    .line 2
    .line 3
    invoke-virtual {p0}, Lo99;->a()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Ls99;->g0:Lt99;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo99;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Ls99;->Z:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final c()I
    .locals 2

    .line 1
    iget-object v0, p0, Ls99;->g0:Lt99;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo99;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Ls99;->Z:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget p0, p0, Ls99;->f0:I

    .line 11
    .line 12
    add-int/2addr v0, p0

    .line 13
    return v0
.end method

.method public final f(II)Lt99;
    .locals 1

    .line 1
    iget v0, p0, Ls99;->f0:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lz38;->f(III)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ls99;->Z:I

    .line 7
    .line 8
    add-int/2addr p1, v0

    .line 9
    add-int/2addr p2, v0

    .line 10
    iget-object p0, p0, Ls99;->g0:Lt99;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lt99;->f(II)Lt99;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ls99;->f0:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lz38;->e(II)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ls99;->Z:I

    .line 7
    .line 8
    add-int/2addr p1, v0

    .line 9
    iget-object p0, p0, Ls99;->g0:Lt99;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Ls99;->f0:I

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ls99;->f(II)Lt99;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
