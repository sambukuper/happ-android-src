.class public final Ly28;
.super La38;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:La38;

.field public final synthetic d:Lz28;


# direct methods
.method public constructor <init>(Lz28;Landroid/content/Context;Landroid/text/TextPaint;La38;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly28;->d:Lz28;

    .line 5
    .line 6
    iput-object p2, p0, Ly28;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Ly28;->b:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, Ly28;->c:La38;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly28;->c:La38;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La38;->d(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly28;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Ly28;->b:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, Ly28;->d:Lz28;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, Lz28;->f(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ly28;->c:La38;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, La38;->e(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
