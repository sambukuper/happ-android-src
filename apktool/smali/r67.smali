.class public final Lr67;
.super Landroid/text/style/CharacterStyle;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final X:Lq67;

.field public final Y:F

.field public final Z:Lrh5;

.field public final f0:Lzi1;


# direct methods
.method public constructor <init>(Lq67;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr67;->X:Lq67;

    .line 5
    .line 6
    iput p2, p0, Lr67;->Y:F

    .line 7
    .line 8
    new-instance p1, Lua7;

    .line 9
    .line 10
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0, v1}, Lua7;-><init>(J)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lr67;->Z:Lrh5;

    .line 23
    .line 24
    new-instance p1, Lhr5;

    .line 25
    .line 26
    const/16 p2, 0x13

    .line 27
    .line 28
    invoke-direct {p1, p0, p2}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lrd7;->b(Ldn2;)Lzi1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lr67;->f0:Lzi1;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget v0, p0, Lr67;->Y:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lmb6;->Z(Landroid/text/TextPaint;F)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lr67;->f0:Lzi1;

    .line 7
    .line 8
    invoke-virtual {p0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/graphics/Shader;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    return-void
.end method
