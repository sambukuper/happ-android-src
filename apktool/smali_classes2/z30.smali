.class public final synthetic Lz30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lql;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Lo88;

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:B

.field public final synthetic h0:Z

.field public final synthetic i0:I

.field public final synthetic j0:Z

.field public final synthetic k0:Ljava/util/Map;

.field public final synthetic l0:Lmx;

.field public final synthetic m0:I

.field public final synthetic n0:I


# direct methods
.method public synthetic constructor <init>(Lql;Lkx4;Lo88;Lgn2;IZIILjava/util/Map;Lmx;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz30;->X:Lql;

    .line 5
    .line 6
    iput-object p2, p0, Lz30;->Y:Lkx4;

    .line 7
    .line 8
    iput-object p3, p0, Lz30;->Z:Lo88;

    .line 9
    .line 10
    iput-object p4, p0, Lz30;->f0:Lgn2;

    .line 11
    .line 12
    iput-byte p5, p0, Lz30;->g0:B

    .line 13
    .line 14
    iput-boolean p6, p0, Lz30;->h0:Z

    .line 15
    .line 16
    iput p7, p0, Lz30;->i0:I

    .line 17
    .line 18
    iput-boolean p8, p0, Lz30;->j0:Z

    .line 19
    .line 20
    iput-object p9, p0, Lz30;->k0:Ljava/util/Map;

    .line 21
    .line 22
    iput-object p10, p0, Lz30;->l0:Lmx;

    .line 23
    .line 24
    iput p11, p0, Lz30;->m0:I

    .line 25
    .line 26
    iput p12, p0, Lz30;->n0:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lz30;->m0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget p1, p0, Lz30;->n0:I

    .line 18
    .line 19
    invoke-static {p1}, Lw79;->P(I)I

    .line 20
    .line 21
    .line 22
    move-result v12

    .line 23
    iget-object v0, p0, Lz30;->X:Lql;

    .line 24
    .line 25
    iget-object v1, p0, Lz30;->Y:Lkx4;

    .line 26
    .line 27
    iget-object v2, p0, Lz30;->Z:Lo88;

    .line 28
    .line 29
    iget-object v3, p0, Lz30;->f0:Lgn2;

    .line 30
    .line 31
    iget-byte v4, p0, Lz30;->g0:B

    .line 32
    .line 33
    iget-boolean v5, p0, Lz30;->h0:Z

    .line 34
    .line 35
    iget v6, p0, Lz30;->i0:I

    .line 36
    .line 37
    iget-boolean v7, p0, Lz30;->j0:Z

    .line 38
    .line 39
    iget-object v8, p0, Lz30;->k0:Ljava/util/Map;

    .line 40
    .line 41
    iget-object v9, p0, Lz30;->l0:Lmx;

    .line 42
    .line 43
    invoke-static/range {v0 .. v12}, Lwl7;->a(Lql;Lkx4;Lo88;Lgn2;IZIILjava/util/Map;Lmx;Llp2;II)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Ldn8;->a:Ldn8;

    .line 47
    .line 48
    return-object p0
.end method
