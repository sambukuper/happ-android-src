.class public final Lfi7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqd1;


# instance fields
.field public final a:Lk17;


# direct methods
.method public constructor <init>(Lk17;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfi7;->a:Lk17;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lle7;Lpd5;)Lsd1;
    .locals 2

    .line 1
    invoke-static {p2}, Lb73;->a(Lpd5;)Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p1, Lle7;->a:Ld73;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, p2, v1}, Lwa;->M(Ld73;Lpd5;Z)Landroid/graphics/ImageDecoder$Source;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_2
    new-instance v1, Lhi7;

    .line 25
    .line 26
    iget-object p1, p1, Lle7;->a:Ld73;

    .line 27
    .line 28
    iget-object p0, p0, Lfi7;->a:Lk17;

    .line 29
    .line 30
    invoke-direct {v1, v0, p1, p2, p0}, Lhi7;-><init>(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lpd5;Lk17;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method
