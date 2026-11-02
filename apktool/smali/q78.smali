.class public final Lq78;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lf63;

.field public final c:Lob;

.field public final d:Lc15;

.field public e:Lfl6;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;Lob;)V
    .locals 1

    .line 1
    new-instance p2, Lf63;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lf63;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lq78;->a:Landroid/view/View;

    .line 10
    .line 11
    iput-object p2, p0, Lq78;->b:Lf63;

    .line 12
    .line 13
    iput-object p3, p0, Lq78;->c:Lob;

    .line 14
    .line 15
    sget-wide p1, Lf88;->b:J

    .line 16
    .line 17
    new-instance p3, Lql;

    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    invoke-direct {p3, v0}, Lql;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p3, p3, Lql;->Y:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    invoke-static {p3, p1, p2}, Lct7;->d(IJ)J

    .line 31
    .line 32
    .line 33
    sget p1, Ls73;->g:I

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lv38;

    .line 41
    .line 42
    const/4 p2, 0x2

    .line 43
    invoke-direct {p1, p0, p2}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    sget-object p2, Lw74;->Y:Lw74;

    .line 47
    .line 48
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 49
    .line 50
    .line 51
    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 52
    .line 53
    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance p1, Landroid/graphics/Matrix;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lc15;

    .line 62
    .line 63
    const/16 p2, 0x10

    .line 64
    .line 65
    new-array p2, p2, [Lp78;

    .line 66
    .line 67
    const/4 p3, 0x0

    .line 68
    invoke-direct {p1, p3, p2}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lq78;->d:Lc15;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final a(Lp78;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq78;->d:Lc15;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq78;->e:Lfl6;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lfl6;

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    invoke-direct {p1, p0, v0}, Lfl6;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lq78;->c:Lob;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lob;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lq78;->e:Lfl6;

    .line 23
    .line 24
    :cond_0
    return-void
.end method
