.class public final synthetic Ldz2;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lgn2;

.field public final synthetic Y:Ly05;


# direct methods
.method public constructor <init>(Lgn2;Ly05;)V
    .locals 6

    .line 1
    iput-object p1, p0, Ldz2;->X:Lgn2;

    .line 2
    .line 3
    iput-object p2, p0, Ldz2;->Y:Ly05;

    .line 4
    .line 5
    const-string v4, "HappToggleField$onToggle(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Ljava/lang/Boolean;)V"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    const-class v2, Lch3;

    .line 10
    .line 11
    const-string v3, "onToggle"

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    invoke-direct/range {v0 .. v5}, Lno2;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object v0, p0, Ldz2;->X:Lgn2;

    .line 4
    .line 5
    iget-object p0, p0, Ldz2;->Y:Ly05;

    .line 6
    .line 7
    invoke-static {v0, p0, p1}, Lg33;->b(Lgn2;Ly05;Ljava/lang/Boolean;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Ldn8;->a:Ldn8;

    .line 11
    .line 12
    return-object p0
.end method
