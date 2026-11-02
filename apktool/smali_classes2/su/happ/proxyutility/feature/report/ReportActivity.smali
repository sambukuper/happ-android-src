.class public final Lsu/happ/proxyutility/feature/report/ReportActivity;
.super Lsu/happ/proxyutility/ui/BaseActivity;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsu/happ/proxyutility/feature/report/ReportActivity;",
        "Lsu/happ/proxyutility/ui/BaseActivity;",
        "<init>",
        "()V",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic S0:I


# instance fields
.field public Q0:Lg6;

.field public final R0:Ly5;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lsu/happ/proxyutility/ui/BaseActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfe6;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lfe6;-><init>(Lsu/happ/proxyutility/feature/report/ReportActivity;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ly5;

    .line 11
    .line 12
    const-class v2, Lle6;

    .line 13
    .line 14
    sget-object v3, Lyb6;->a:Lzb6;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Lfe6;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v3, p0, v4}, Lfe6;-><init>(Lsu/happ/proxyutility/feature/report/ReportActivity;B)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lfe6;

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    invoke-direct {v4, p0, v5}, Lfe6;-><init>(Lsu/happ/proxyutility/feature/report/ReportActivity;B)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v0, v4}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lsu/happ/proxyutility/feature/report/ReportActivity;->R0:Ly5;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lsu/happ/proxyutility/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lt46;->activity_report:I

    .line 5
    .line 6
    sget-object v0, Lx91;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x1020002

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/ViewGroup;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v0, v1, p1}, Lx91;->a(Landroid/view/ViewGroup;II)Lkw8;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p1, Lg6;

    .line 37
    .line 38
    iput-object p1, p0, Lsu/happ/proxyutility/feature/report/ReportActivity;->Q0:Lg6;

    .line 39
    .line 40
    iget-object p1, p1, Lkw8;->Z:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/ui/BaseActivity;->setBarsParams(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lsu/happ/proxyutility/feature/report/ReportActivity;->Q0:Lg6;

    .line 49
    .line 50
    const-string v0, "binding"

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p1, Lg6;->p0:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->r(Landroidx/appcompat/widget/Toolbar;)V

    .line 58
    .line 59
    .line 60
    sget p1, Ly46;->title_report_problem:I

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lsu/happ/proxyutility/feature/report/ReportActivity;->Q0:Lg6;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-object p1, p1, Lg6;->o0:Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v2, Lx42;

    .line 79
    .line 80
    const/4 v3, 0x4

    .line 81
    invoke-direct {v2, p0, v3}, Lx42;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lsu/happ/proxyutility/feature/report/ReportActivity;->Q0:Lg6;

    .line 88
    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    iget-object p1, p1, Lg6;->n0:Lcom/google/android/material/checkbox/MaterialCheckBox;

    .line 92
    .line 93
    new-instance v2, Lpr0;

    .line 94
    .line 95
    const/4 v3, 0x1

    .line 96
    invoke-direct {v2, p0, v3}, Lpr0;-><init>(Landroid/view/KeyEvent$Callback;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v2}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lsu/happ/proxyutility/feature/report/ReportActivity;->Q0:Lg6;

    .line 103
    .line 104
    if-eqz p1, :cond_0

    .line 105
    .line 106
    iget-object p1, p1, Lg6;->m0:Lsu/happ/proxyutility/ui/foundation/component/button/HappTextButton;

    .line 107
    .line 108
    new-instance v0, Lst0;

    .line 109
    .line 110
    const/16 v2, 0x10

    .line 111
    .line 112
    invoke-direct {v0, p0, v2}, Lst0;-><init>(Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 119
    .line 120
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    sget-object v0, Ltp1;->a:Lnf1;

    .line 125
    .line 126
    sget-object v0, Ldm4;->a:Lhv2;

    .line 127
    .line 128
    new-instance v2, Lee6;

    .line 129
    .line 130
    invoke-direct {v2, p0, v1, v3}, Lee6;-><init>(Lsu/happ/proxyutility/feature/report/ReportActivity;Lq51;B)V

    .line 131
    .line 132
    .line 133
    const/4 p0, 0x2

    .line 134
    invoke-static {p1, v0, v2, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_0
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_1
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v1

    .line 146
    :cond_2
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :cond_3
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v1
.end method
